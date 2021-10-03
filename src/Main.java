import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        String article[] = {"the", "a", "one", "some", "any"};
        String noun[] = {"boy", "dog", "car", "bicycle"};
        String verb[] = {"ran", "jumped", "sang", "moves"};
        String preposition[] = {"away", "towards", "around", "near"};

        String names[] = {"Mark", "Tom", "Julia", "Vlada", "Pera", "Misko", "Katarina", "Jelena"};
        String last_names[] = {"Sicily", "Osadkovski", "Markovis", "Omenda", "Virgo", "Opernal", "Makserna", "Molotovic"};

        String days[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String months[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String years[] = {"1911", "1945", "1966", "1987", "1999", "1921", "1934", "1975", "1971", "1998", "1995", "1959", "1912", "1855", "2002", "2010"};

        // randomly create data
        for (int j = 0; j < 5; j++) {

            int article1 = random.nextInt(article.length - 1);
            // generate others here like noun_index, verb_index, ....
            int noun_index = random.nextInt(article.length - 1);
            int verb_index = random.nextInt(article.length - 1);
            int preposition_index = random.nextInt(article.length - 1);
            int article_index = random.nextInt(article.length - 1);
            int noun2_index = random.nextInt(article.length - 1);

            StringBuilder title = new StringBuilder();

            title.append(article[article1]).append(" ")
                    .append(noun[noun_index]).append(" ")
                    .append(verb[verb_index]).append(" ")
                    .append(preposition[preposition_index]).append(" ")
                    .append(article[article_index]).append(" ")
                    .append(noun[noun2_index]);
            title.setCharAt(0, Character.toUpperCase(title.charAt(0)));
            String title_sentence = title.toString();

            StringBuilder author = new StringBuilder();
            int name_index = random.nextInt(names.length - 1);
            int lastname_index = random.nextInt(last_names.length - 1);
            author.append(names[name_index]).append(" ").append(last_names[lastname_index]);
            String authorName = author.toString();

            StringBuilder date = new StringBuilder();
            int day_index = random.nextInt(days.length - 1);
            int month_index = random.nextInt(months.length - 1);
            int year_index = random.nextInt(years.length - 1);

            int day = Integer.valueOf(days[day_index]);
            int month = Integer.valueOf(months[month_index]);
            int year = Integer.valueOf(years[year_index]);

            Calendar yearPublished = Calendar.getInstance();
            yearPublished.set(year, month, day);

            Book book = new Book(null, title_sentence, yearPublished, authorName);

            System.out.println(book.toString());

        }
    }

}
