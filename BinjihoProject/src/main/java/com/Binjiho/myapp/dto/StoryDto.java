package com.Binjiho.myapp.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StoryDto {

	   private int storyId;
	   private String storyTitle;
	   private String storyContent;
	   private long fileSize;
	   private String userSeqfk;
	   private String storyUrl;
	   @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone="Asia/Seoul")
	   private Date regDt;
	   private int storyGoal;
	   private String storyLocation;
	   private String storyfileUrl;
	   
	   public String getStoryFileUrl() {
		return storyfileUrl;
	}
	public void setStoryFileUrl(String fileUrl) {
		this.storyfileUrl = fileUrl;
	}
	@Override
	public String toString() {
		return "StoryDto [storyId=" + storyId + ", storyTitle=" + storyTitle + ", storyContent=" + storyContent
				+ ", fileSize=" + fileSize + ", userSeqfk=" + userSeqfk + ", storyUrl=" + storyUrl + ", regDt=" + regDt
				+ ", storyGoal=" + storyGoal + ", storyLocation=" + storyLocation + ", fileList=" + fileList + "]";
	}
	public int getStoryGoal() {
		return storyGoal;
	}
	public void setStoryGoal(int storyGoal) {
		this.storyGoal = storyGoal;
	}
	public String getStoryLocation() {
		return storyLocation;
	}
	public void setStoryLocation(String storyLocation) {
		this.storyLocation = storyLocation;
	}
	private List<StoryFileDto> fileList;
	   
	public List<StoryFileDto> getFileList() {
		return fileList;
	}
	public void setFileList(List<StoryFileDto> fileList) {
		this.fileList = fileList;
	}
	public int getStoryId() {
		return storyId;
	}
	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}
	public String getStoryTitle() {
		return storyTitle;
	}
	public void setStoryTitle(String storyTitle) {
		this.storyTitle = storyTitle;
	}
	public String getStoryContent() {
		return storyContent;
	}
	public void setStoryContent(String storyContent) {
		this.storyContent = storyContent;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getUserSeqfk() {
		return userSeqfk;
	}
	public void setUserSeqfk(String userSeqfk) {
		this.userSeqfk = userSeqfk;
	}
	public String getStoryUrl() {
		return storyUrl;
	}
	public void setStoryUrl(String storyUrl) {
		this.storyUrl = storyUrl;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	
	
}
