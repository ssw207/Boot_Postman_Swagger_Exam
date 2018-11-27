package com.song.woo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.song.woo.domain.CallHist;

public interface CallHistDao extends JpaRepository<CallHist, Long>{

}
