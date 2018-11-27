package com.song.woo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.common.io.BaseEncoding;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CallHist extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long seq;

	@Column(length = 30)
	private String ph_intra;
	
	@Column(length = 30)
	private String ph_client;
}
