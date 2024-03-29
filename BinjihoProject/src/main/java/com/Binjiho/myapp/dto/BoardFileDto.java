package com.Binjiho.myapp.dto;

import java.util.Date;

public class BoardFileDto {

	 private int fileId;
	   private int boardId;
	   private String fileName;
	   private long fileSize;
	   private String fileContentType;
	   private String fileUrl;
	   private Date regDt;
	   
	   public int getFileId() {
	      return fileId;
	   }
	   public void setFileId(int fileId) {
	      this.fileId = fileId;
	   }
	   public int getBoardId() {
	      return boardId;
	   }
	   public void setBoardId(int boardId) {
	      this.boardId = boardId;
	   }
	   public String getFileName() {
	      return fileName;
	   }
	   public void setFileName(String fileName) {
	      this.fileName = fileName;
	   }
	   public long getFileSize() {
	      return fileSize;
	   }
	   public void setFileSize(long fileSize) {
	      this.fileSize = fileSize;
	   }
	   public String getFileContentType() {
	      return fileContentType;
	   }
	   public void setFileContentType(String fileContentType) {
	      this.fileContentType = fileContentType;
	   }

	   public String getFileUrl() {
	      return fileUrl;
	   }
	   public void setFileUrl(String fileUrl) {
	      this.fileUrl = fileUrl;
	   }
	   public Date getRegDt() {
	      return regDt;
	   }
	   public void setRegDt(Date regDt) {
	      this.regDt = regDt;
	   }
	   @Override
	   public String toString() {
	      return "boardFile [fileId=" + fileId + ", boardId=" + boardId + ", fileName=" + fileName
	            + ", fileSize=" + fileSize + ", fileContentType=" + fileContentType + "]";
	   }

}
