package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//item类 是这样的
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}

