import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {

        try {
            File file = new File("src/films.txt");
            Scanner fs = new Scanner(file);

            fs.useDelimiter(";");
            int size = Integer.parseInt(fs.nextLine());
           System.out.println(size);
            Film[] films = new Film[size];

            for(int i = 0 ;i < size;i++){
                fs.useDelimiter(";");
                int year = Integer.parseInt(fs.next());
                int length = Integer.parseInt(fs.next());
                String title = fs.next();
                String genre = fs.next();
                String actor = fs.next();
                String actress = fs.next();
                String director = fs.next();
                int popularity = Integer.parseInt(fs.next());

                String awards = fs.next();

                String image = fs.nextLine();


                films[i] = new Film(title, year, length, genre, actor, actress, director, popularity, awards, image);

            }

//            for (Film film : films) {
//                System.out.println(film.toString());
//            }
            System.out.println("MOST POPULAR : "+ mostPopular(films));
            System.out.println("AVERAGE LENGTH : "+ averageLength(films));
             printAwardWinningTitles(films) ;


            fs.close();
        } catch (IOException ex) {
            System.out.println("Something went wrong");
        }
    }
    public static Film mostPopular(Film[] films){

        int mostPop = 0 ;
        String pop = " ";
        int index = 0;
        Film mostPopular = null;

        for(Film film : films) {
            int popular = film.getPopularity();

            if (popular > mostPop) {
                index = mostPop;
                mostPop = popular;

            }
            if (film.getPopularity() == mostPop) {
                pop = films[popular].getTitle();
            }
        }

        for(Film film : films) {
            if (pop.equals(film.title)) {
                mostPopular = film;
            }
        }

    return  mostPopular;
    }

    public static int averageLength(Film[] films){
        int averageLength = 0;
        int length = 0;
        int count = 0 ;

        for(Film film : films){
            length += film.getLength();
            count ++;
        }
        averageLength = length /count;
        return averageLength;
    }

    public static void printAwardWinningTitles(Film[] films){

        String awardWinners = "";


        for(Film film : films){
            String awards =film.getAwards();
            if(awards.equals("Yes")){
                awardWinners += film.getTitle() + "\n";
            }
        }
           System.out.println("AWARDS WINNERS : "+ "\n"+ awardWinners);
    }


}


