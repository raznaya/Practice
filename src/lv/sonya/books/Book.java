package lv.sonya.books;

public class Book {

		private String author;
		private String bookName;
		private int pageCount;
		private int year;
		
		
	public Book(String author, String bookName, int pageCount, int year) {
			this.author = author;
			this.bookName = bookName;
			this.pageCount = pageCount;
			this.year = year;
		}

	public String getAuthor(){
		return author;
	}

	public void setAuthor(String name){
	      author = name;
	   }
	
	public String getBookName(){
		return bookName;
	}
	
	public void setBookName(String name){
		bookName = name;
	}
	
	public int getPageCount(){
		return pageCount;
	}
	
	public void setPageCount(int count){
		pageCount = count;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int number){
		year = number;
	}
	
	@Override
    public String toString()
    {
        return this.bookName + ", " + this.author + ", " + getYear()+ ", " + getPageCount() + " pages.";
    }
}

