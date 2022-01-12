package day31_Constructors;

public class MovieObjects {
    public static void main(String[] args) {

   Movie movie1 = new Movie("USA","Journey to SDET: Cydeo Batch 25","Adventure, Comedy, Thriller","05/25/2022","Kuzzat Altay");

   String[] students ={"George","Layan","Kristina", "Maria","Amin"};



movie1.addCast("Asiya");
movie1.addCast("Adam");
movie1.addCast("Muhtar");
movie1.addCasts(students);

        System.out.println(movie1);





    }
}
/*
3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */