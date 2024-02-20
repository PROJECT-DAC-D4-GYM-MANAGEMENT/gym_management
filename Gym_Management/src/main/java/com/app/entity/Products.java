//package com.app.entity;
//
//import java.time.LocalDate;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Entity
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString(callSuper = true)
//public class Products {
//	@Column(length = 20)
//	private String prodName;
//	@Column(length = 200)
//	private String description;
//	private double price;
//	private int stock;
//
//}

package com.app.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Products extends BaseEntity {
	
	@Column(length = 20)
	private String name;
	private double price;
	private int stock;
	private String supplier;
	private String category;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "plan_images", joinColumns = @JoinColumn(name = "Product_id"))
	@Column(name = "images")
	private List<String> images = new ArrayList<>();

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "product_description", joinColumns = @JoinColumn(name = "Product_id"))
	@Column(name = "description")
	private List<String> description = new ArrayList<>();

}
