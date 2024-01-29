public class Film {
    String title;
    int year;
    int length;
    String genre;
    String actor;
    String actress;
    String director;
    int popularity;
    String awards;
    String image;


    public Film(String title, int year, int length, String genre, String actor,
                String actress,String director ,  int popularity,String awards, String image) {
        this.title = title;
        this.year = year ;
        this.length = length;
        this.genre = genre;
        this.actor = actor;
        this.actress = actress;
        this.director = director;
        this.popularity = popularity;
        this.awards = awards;
        this.image = image;

    }



    public String getTitle(){
        return this.title;
    }
    public int getYear(){

        return year;
    }
    public int getLength(){

        return length;
    }
    public String getGenre(){

        return genre;
    }
    public String getActor(){
        return actor;
    }
    public String getActress(){
        return actress;
    }
    public String getDirector(){
        return director;
    }
    public int getPopularity(){
       return popularity;
     }
    public String getAwards(){
        return awards;
    }
    public String getImage(){
        return image;
    }

    public String toString(){
        String output = "";
         output += "Title:  "+ getTitle() +"\n";
         output += "Year:  "+ getYear() +"\n";
         output += "Length:  "+ getLength() +"\n";
         output += "Genre:  "+ getGenre() +"\n";
         output += "Actor:  "+ getActor() +"\n";
         output += "Actress:  "+ getActress() +"\n";
         output += "Director:  "+ getDirector() +"\n";
         output += "Popularity:  "+ getPopularity() +"\n";
         output += "Image :  "+ getImage() +"\n";

    return output ;
    }
}