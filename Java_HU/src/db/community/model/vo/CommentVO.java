package db.community.model.vo;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommentVO {


	private int cm_num;   
	private int cm_ori_num;  
	private int cm_report;  
	private int cm_state; 
	private int cm_po_num;  
	private String cm_content;
	private String cm_me_id;
	private Date cm_date;
	
	public CommentVO(int po_num, String content, String id) {
		this.cm_po_num = po_num;
		this.cm_content = content;
		this.cm_me_id = id;
	}

	@Override
	public String toString() {
		return cm_me_id + "|" + cm_content;
	}
	
}