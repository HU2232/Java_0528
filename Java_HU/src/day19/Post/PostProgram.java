package day19.Post;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import HomeWorks.Members.V1.Schedule;
import Program.Program;

public class PostProgram implements Program{

	private Scanner scan = new Scanner(System.in);
	private List<Post> list = new ArrayList<Post>();
	
	private final int INSERT = 1;
	private final int UPDATE = 2;
	private final int DELETE = 3;
	private final int SEARCH = 4;
	private final int EXIT = 5;
	
	private String fileName = "src/day19/Post/data.txt";
	
	@Override
	public void printMenu() {
		System.out.print(
				  "메인메뉴 \r\n"
				+ "1. 게시글 작성\r\n"
				+ "2. 게시글 수정\r\n"
				+ "3. 게시글 삭제\r\n"
				+ "4. 게시글 조회\r\n"
				+ "5. 프로그램 종료\r\n"
				+ "메뉴 선택 : ");	
	}
	
	private void printBar() {
		System.out.println("----------------------------");
		}
	
	@Override
	public void run() {
		int menu;
		load(fileName);
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			printBar();
			//선택한 메뉴 실행
			try {
				runMenu(menu);
			} catch (Exception e) {
				System.out.println("예외가 발생했습니다");
				e.printStackTrace();
			}
		} while(menu != EXIT);
		
		save(fileName);
	}	
	
	@Override
	public void save(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.write(Post.getCount());
			oos.writeObject(list);
		} catch (Exception e) {
			System.out.println("저장에 실패했습니다.");
		}
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public void load(String fileName) {
			try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
				int count = ois.read();
				Post.setCount(count);
				list = (List<Post>)ois.readObject();
			} catch (Exception e) {
				System.out.println("불러오기에 실패했습니다.");
			} 
		}
		
	@Override
	public void runMenu(int menu) throws Exception {
		switch(menu) {
		case INSERT:
			insert();
			break;
		case UPDATE:
			update();
			break;
		case DELETE:
			delete();
			break;
		case SEARCH:
			search();
			break;
		case EXIT:
			exit();
			break;
		}
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다");
		
	}

	private void search() {
		//검색어 입력
		System.out.println("검색어(전체는 엔터) : ");
		String search = scan.nextLine();
				
		//게시글에서 검색어가 제목 또는 내용에 들어간 게시글 리스트를 가져옴
		List<Post> searchList = getSearchList(search);
		
		//게시글 리스트가 비어있으면 안내문구 출력 후 종료
		if(searchList.size() == 0) {
			System.out.println("검색어와 일치하는 게시글이 없습니다.");
		}
		//가져온 게시글 리스트 출력
		printList(searchList);
		//게시글을 확인할 것인지 선택 
		System.out.print("게시글을 확인하시겠습니까?(Y/N)");
		char ok = scan.next().charAt(0);
		//확인하지 않겠다고 할 경우 종료
		if(ok != 'y') {
			return;
		}
		//확인하면 게시글 번호를 입력받음
		printBar();
		System.out.print("검색 결과 중 확인할 게시글 번호 : ");
		int num = scan.nextInt();
		//입력받은 게시글 번호로 겍체를 생성하고 
		Post post = new Post(num);
		//검색 리스트에서 생성된 객체와 일치하는 번지를 확인해서
		int index = searchList.indexOf(post);
		//번지가 유효하지 않으면 안내문구 출력 후 종료
		printBar();
		if(index < 0) {
			System.out.println("검색 결과에는 없는 게시글입니다.");
			return;
		}
		//유효하면 번지에 있는 게시글을 가져옴
		post = searchList.get(index);
		//가져온 게시글을 출력
		post.print();
		//메뉴로 돌아가려먼....문구 출력
		printBar();
		System.out.println("메뉴로 돌아가려면 엔터를 치세요.");
		//엔터를 입력받도록 처리
		scan.nextLine();//게시글 번호 입력할 때 남은 공백처리
		scan.nextLine();//공백처리
	}

	private void printList(List<Post> searchList) {
		for(Post post : searchList) {
			System.out.println(post);
		}
	}

	private List<Post> getSearchList(String search) {
		
		List<Post> searchList = new ArrayList<Post>();
		//전체 게시글에서 하나씩 꺼내서 전체 탐색
		for(Post post : list)
			//게시글의 제목 또는 내용에 검색어가 포함되어 있으면 검색 리스트에 추가
			if(post.getTitle().contains(search) ||
			   post.getContents().contains(search)) {
			   searchList.add(post);
			}
		return searchList;
	}		
		//스트림을 이용하여 검색어와 일치하는 게시글 리스트를 가져
		/* return list.stream()
				.filter(p->p.getTitle().contains(search)
						|| p.getContents().contains(search)
						.collet(Collectors.toList()));
	}*/

	private void delete() {
		//삭제할 게시글 번호를 입력
		System.out.print("삭제할 게시글 번호 : ");
		int num = scan.nextInt();
		//게시글이 번호에 맞는 게시글을 가져옴
		Post post = selectPost(num);
		//게시글이 없으면 종료
		/*if(post == null) {
			return;
		}
		//리스트에서 게시글을 삭제
		list.remove(post);
		System.out.println(post.getNum() + "게시글을 삭제하였습니다.");
		*/
		//위의 주석처리된 코드를 2줄로 짜리로 정리한 코드
		//게시글을 리스트에서 삭제하는데 성공하면 안내 문구 출력
		if(list.remove(post)) {
			System.out.println(post.getNum() + "번 게시글을 삭제하였습니다.");
		}
	}

	private void update() {
		//수정할 게시글 번호 입력		
		System.out.print("수정할 게시글 번호 : ");
		int num = scan.nextInt();
		//게시글 번호에 맞는 게시글을 가져옴
		Post post = selectPost(num);
		//게시글이 없으면 종료
		if(post == null) {
			return;
		}
		
		//같으면 새 제목과 내용을 입력받음
		scan.nextLine();//공백처리
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		//가져온 객체의 제목과 내용을 입력받은 제목과 내용으로 수정
		post.update(title, contents);
		//안내문구 출력
		printBar();
		System.out.println(post.getNum() + "번 게시글이 수정되었습니다.");
	}

	private void insert() {
		//게시글 정보를 입력
		scan.nextLine();//공백처리
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		System.out.print("ID : ");
		String ID = scan.next();
		System.out.print("비번 : ");
		String PW = scan.next();
		//입력한 정보를 이용해서 게시글 객체 생성
		Post post = new Post(title, contents, ID, PW);
		//생성한 객체를 리스트에 추가
		list.add(post);
		//알림문구 출력
		printBar();
		System.out.println(post.getNum() + "번 게시글이 추가되었습니다.");
		printBar();
		}
	
	//게시글 번호가 주어지면 게시글을 가져오는 메소드(아이디, 비번 확인해서)
	public Post selectPost(int num) {
		//입력한 게시글 번호를 이용하여 게시글 겍체를 생성
		Post post = new Post(num);
		//리스트에서 생성한 객체가 몇번지에 있는지 번지를 가져옴
		int index = list.indexOf(post);
		//일치하는 객체가 없으면(가져온 번지가 0보다 작으면) 알림문구 출력 후 종료
		if(index < 0) {
			printBar();
			System.out.println("등록되지 않거나 삭제된 게시글입니다");
				return null;
			}
		//일치하는 객체가 있으면 ID,PW를 입력받고
		System.out.print("ID : ");
		String ID = scan.next();
		System.out.print("PW : ");
		String PW = scan.next();
		//가져온 객체의 아이디와 비번이 입력받은 정보와 같은지 확인
		//같지 않으면 안내문구 출력 후 종료
		post = list.get(index);
		if(!post.checkWriter(ID, PW)) {
			printBar();
			System.out.println("아이디 또는 비밀번호를 잘못 입력하였습니다.");
				return post;
			}
		return post;
	}
}
