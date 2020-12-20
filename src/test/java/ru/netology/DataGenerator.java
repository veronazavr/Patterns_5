package ru.netology;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Data
@NoArgsConstructor

public class DataGenerator {

        public static <T> T getRandom(List<T> list) {
            Random random = new Random();
            return list.get(random.nextInt(list.size()));
        }

        public static String getRandomCity() {
            List<String> list = Arrays.asList("Тула", "Москва", "Екатеринбург", "Кострома");
            return getRandom(list);
        }


        public static String getRandomCityInvalid() {
        List<String> list = Arrays.asList("Камышин", "Волжский", "Балашиха", "Одинцово");
        return getRandom(list);
    }

    public static String getDate(int day) {
        return LocalDate.now().plusDays(day).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String getFakerName() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.name().firstName() + " " + faker.name().lastName();
    }

    public static String getFakerPhone() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.phoneNumber().phoneNumber();
    }

    }
