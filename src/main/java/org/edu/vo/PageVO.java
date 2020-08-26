package org.edu.vo;

public class PageVO {
   private int StartNo;//게시판테이블,회원테이블의 필드와는 직접관계없음 . 
   private int perPageNum;//내장형 변수 쿼리에서 필요함
   private Integer page;//(클래스형 변수) jsp단에서 null로 값이 올때 에러가 발생하지 않도록 Integer사용
   private int totalCount;
   private int endPage;//밑에 1,2,3,4,5중 5
   private int startPage;//밑에 1,2,3,4,5중 1
   private boolean prev;//전 페이지
   private boolean next;//다음 페이지
   //검색용 변수 2개추가 
   private String searchType;
   private String searchKeyword;
 
   
   public String getSearchType() {
	return searchType;
}

public void setSearchType(String searchType) {
	this.searchType = searchType;
}

public String getSearchKeyword() {
	return searchKeyword;
}

public void setSearchKeyword(String searchKeyword) {
	this.searchKeyword = searchKeyword;
}

private void calcPage() {
      //page변수는 현재 jsp에서 클릭한 페이지 번호
      int tempEnd = (int)(Math.ceil(page/(double)this.perPageNum)*this.perPageNum);
      //ceil 함수는 천장 함수로 1.1 = 2, 2.1 = 3 으로 출력된다.
      //반대되는 바닥함수로 floor(), 반올림 함수로 round()가 있다.
      //jsp에서 클릭한 페이지 번호를 기준으로 끝 페이지를 계산한다.
      this.startPage = (tempEnd - this.perPageNum)+1;
      //시작 페이지 계산 클릭한 page번호 10일때 까지 시작페이지는 1
      if(tempEnd * this.perPageNum > this.totalCount) {
         //클릭한 page번호로 계산된 게시물수가 실제 게시물 개수 totalCount 클때
         this.endPage = (int)Math.ceil(this.totalCount/(double)this.perPageNum);
      }else {
         //클릭한 page번호로 계산된 게시물수가 실제 게시물 개수 totalCount 작을때
         this.endPage = tempEnd;
      }
      this.prev = this.startPage != 1;// 시작 페이지가 1보다 크면 무조건 이전 페이지가 있다. true
      this.next = this.endPage * this.perPageNum < this.totalCount;
      //클릭한 page번호로 계산된 게시물수가 실제 게시물 개수보다 작다면 다음페이지가 있음. true
   }
   
  
   public int getTotalCount() {
      return totalCount;
   }
   public void setTotalCount(int totalCount) {
      this.totalCount = totalCount;
      calcPage(); //totalCount 전체게시물개수가 있어야지 페이지 계산을 할 수 있기 때문에
   }
   public int getEndPage() {
      return endPage;
   }
   public void setEndPage(int endPage) {
      this.endPage = endPage;
   }
   public int getStartPage() {
      return startPage;
   }
   public void setStartPage(int startPage) {
      this.startPage = startPage;
   }
   public boolean isPrev() {
      return prev;
   }
   public void setPrev(boolean prev) {
      this.prev = prev;
   }
   public boolean isNext() {
      return next;
   }
   public void setNext(boolean next) {
      this.next = next;
   }
   public Integer getPage() {
      return page;
   }
   public void setPage(Integer page) {
      this.page = page;
   }
   public int getStartNo() {
      //DB쿼리에서 사용.. 시작데이터번호 = (jsp 클릭한 페이지번호 -1)*페이지당 보여지는 개수
	   StartNo = (page - 1) * perPageNum;
      return StartNo;
   }
   public void setStartNo(int StartNo) {
      this.StartNo = StartNo;
   }
   public int getPerPageNum() {
      return perPageNum;
   }
   public void setPerPageNum(int perPageNum) {
      this.perPageNum = perPageNum;
   }
   
}