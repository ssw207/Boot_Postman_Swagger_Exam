package com.song.woo.callhist;

import org.springframework.data.jpa.repository.JpaRepository;

import com.song.woo.callhist.domain.CallHist;

public interface CallHistDao extends JpaRepository<CallHist, Long>{

}
