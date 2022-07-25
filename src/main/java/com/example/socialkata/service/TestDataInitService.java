package com.example.socialkata.service;

import com.example.socialkata.model.entity.user.Active;
import com.example.socialkata.model.entity.user.Role;
import com.example.socialkata.model.entity.user.User;
import com.example.socialkata.service.abstracts.model.ActiveService;
import com.example.socialkata.service.abstracts.model.RoleService;
import com.example.socialkata.service.abstracts.model.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class TestDataInitService {

    private final UserService userService;

    private final RoleService roleService;

    private final ActiveService activeService;

    private final String[] firstNames = new String[] {"Pep", "Jon", "Edd", "Cercei", "Jamie", "Karl", "Son", "Smith",
            "Robert", "Aegon", "Samuel", "Xavi", "Anderson", "Zak", "Ollie", "Jora", "Clark", "Winter",
            "Sam", "Oleg", "Frank", "Nadya", "Freya", "Lina", "Maiden", "Abba", "Olya", "Alexander",
            "Brad", "Hotpie", "Kent", "Axe", "Riki", "Brew", "Swann", "Crow", "Rafa", "David",
            "Andrew", "Phill", "Peter", "Jaque", "Jaqen", "Lyanna", "Ygritte", "Robb", "Fernando", "Lionel",
            "Chris", "Joe"};

    private final String[] lastNames = new String[] {"Flow", "Snow", "Sand", "Wind", "Winter", "Kastark", "Sow",
            "White", "Walker", "Anderson", "Jackson", "Willie", "Stones", "Doche", "Dickens", "Lowe", "Locke", "Crown",
            "Lannister", "Stark", "Baratheon", "Mayweather", "Zidan", "Zork", "Foden", "Sad", "Happy", "Green",
            "Brown", "Sweet", "Peek", "Pozdnyakov", "Loft", "Breek", "Shrope", "Zelenskiy", "Johnson", "Obama",
            "Beckham", "River", "Warm", "Worm", "Vow", "Vien", "North", "Bar", "Boi", "Baiden",
            "Fresco", "Halaand"};

    private final String[] educations = new String[] {"Master degree", "High School", "Ph.D", "Highgarden",
            "Stanford University", "NNTU, Russia", "Oxford, United Kingdom", "Harvard, United States", "Home, Homeland",
            "California IoT, United States", "UCL, United Kingdom", "ETH Zurich, Switzerland",
            "University of Chicago, United States", "Yale, USA", "MGU, Russia","EPFL, Switzerland", "UM, Malasiya",
            "Sweet Crown university, noland", "SNU, Seul", "The University of Tokyo, Japan",
            "The University of Toronto, Canada", "NONE", "Duke university, USA",
            "KAIST, South Korea", "Sorbonne, France", "Lomonosov University, Russia", "KU Leuven, Belgium",
            "Tohoku, Japan", "Brown university, USA", "Osaka unviersity, Japan", "Pork University, USA",
            "The University of Western Australia", "KTH Royal Institute of Technology, Sweden",
            "Rice University, USA", "University of Oslo, Norway", "University of Helsinki, Finland",
            "Nagoya, Japan", "Bern University, Switzerland", "NewCastle University, United Kingdoms",
            "Saint Jaque Fresco's University, Worldwide", "Kyushi, Japan", "Politecnico di Milano, Italy",
            "Crapp, USA", "Lancaster University, United Kingdoms", "TUB, Germany", "NGTU, Russia", "RGGU, Russia",
            "Church Applied School", "8 years of high school", "Nyaniang Technology, Singapoore"};

    private final String[] cities = new String[] {"Москва", "Pavlovo", "Gorky", "Budapest", "London",
            "Liverpool", "Amsterdam", "Manchester", "Zurich", "Oslo", "St.Petersburg", "Vladimir", "Perm", "Tokyo",
            "Vale", "Milan", "Rome", "Toronto", "Madrid", "Barcelona", "Vladivostok", "Kazan", "Rostov", "Murmansk",
            "Заполярный", "Чита", "Краснодар", "Berlin", "Borussia", "Frankfurt", "Bayern", "Koln", "Kyoto",
            "Samara", "Volgograd", "Paris", "Riverrun", "Magadan", "Severodvinsk", "Kyev", "Zhytomir", "Odessa",
            "Maryupol", "Dontesk", "Lviv", "Vinnica", "Cherkasy", "Holy Heaven", "Mountain", "Skyes"};

    private final String[] emails = new String[] {"admin@gmail.com", "eety@gmail.com", "fett@gmail.com",
            "nbnb@gmail.com","d4444@gmail.com", "dsx@gmail.com", "zz5@gmail.com", "dbvnnd@gmail.com", "cxt@gmail.com",
            "ddghkgkgkgk@gmail.com", "dd2hg@gmail.com", "kkkkkyy@gmail.com", "ddjyj@gmail.com", "try@gmail.com",
            "SOKOL@mail.com", "dklskdl@rambler.ru", "dd2h888g@gmail.com", "dd2dsgg@gmail.com", "d78794@gmail.com",
            "ddh55hg@gmail.com", "ddevrr@gmail.com", "dvzg@mail.com", "rrr@gmail.com", "xxxv@gmail.com",
            "dbnny@gmail.com", "mmzz@gmail.com", "d558hg@gmail.com", "lplplpl@gmail.com", "vvvvvv@gmail.com",
            "zzzzt@gmail.com", "jkh,@gmail.com", "ddsoad23@gmail.com", "lololo@gmail.com", "ccvx@gmail.com",
            "vet446g@gmail.com", "o87o7@gmail.com", "dd4g@gmail.com", "lilil@gmail.com", "rewrv@gmail.com",
            "64363646@gmail.com", "kjhoo@gmail.com", "oooooomhg@gmail.com", "ooiio@gmail.com", "user@gmail.com"
            , "3255114@gmail.com", "bbtbhjk@gmail.com", "uytre@gmail.com", "ertyhgf@gmail.com", "nbvmnb@gmail.com"
            , "kdwetu@gmail.com"};

    //two BCrypted passwords: "admin" for "ROLE_ADMIN" & "user" for "ROLE_USER"
    private final String[] passwords = new String[] {"$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW",
            "$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n."};

    private final String[] statuses = new String[] {"Chill", "relax", "Bored", "Lazy", "breathing", "zzzZzz...",
            "O_O", ":)", ")))", "??", "Walking", "busy", "InLov3", "3321", "Chill", "Отдихаю", "counting", "standing",
            "Дышу", "zzzZzz...", "O_O", ":)", ")))", "??", "Walking", "busy", "InLov3", "3321",
            "Chill", "skooka", "coughing", "doing plank", "FLEXING", "zzzZzz...", "SLOZNO", ":)",
            ")))", "??", "Walking", "KEK", "L0L", "CRINGEEE", "EZ", "watching", "feeling", "blanked", "thinking",
            "zzzZzz...", "O_O_O", "woto ez"};

    private final String[] professions = new String[] {"Lirik", "Повар", "Craftmen", "Driver",
            "Teacher", "Manager", "Boss", "Joker", "SellSword", "Junior Developer",
            "Agent", "Talker", "Speeker", "President", "Engineer", "Master", "Trainy", "Goalkeeper",
            "Senior Java Developer", "Lirik", "Повар", "Уборщица", "Кладовщик",
            "Teacher", "Manager", "Начальник склада", "Водитель автобуса", "SellSword", "Junior Developer",
            "Agent", "Talker", "Speeker", "Начальник столовой", "Engineer", "Master", "Pilot", "Goalkeeper",
            "Garbage Collecotor", "Singer", "Professor", "Electric", "Doctor",
            "Money collector", "Manager", "Boss", "Joker", "SellSword", "Стюардесса",
            "Agent", "Talker", "Speeker", "President", "Engineer", "Master", "On a bench", "Goalkeeper",
            "Senior Java Developer"};

    @Autowired
    public TestDataInitService(UserService userService, RoleService roleService, ActiveService activeService) {

        this.userService = userService;
        this.roleService = roleService;
        this.activeService = activeService;
    }

    public void initRole(String name) {
        roleService.create(new Role(name));
    }

    public void initActive(String name) {
        activeService.create(new Active(name));
    }

    public void initUser(User user) {
        userService.create(user);
    }

    public void setUsersWithRandomParameters() {
        initRole("ROLE_ADMIN");
        initRole("ROLE_USER");

        initActive("active");

        LocalDate dateOfBirth = LocalDate.of(1901, 7, 28);

        for (int i = 0; i < 50; i++) {
            User user = new User();
            user.setFirstName(firstNames[i]);
            user.setLastName(lastNames[i]);
            user.setEducation(educations[i]);
            dateOfBirth = dateOfBirth.plusWeeks(i);
            dateOfBirth = dateOfBirth.plusDays(i);
            user.setDateOfBirth(dateOfBirth);
            user.setCity(cities[i]);
            user.setEmail(emails[i]);
            user.setStatus(statuses[i]);
            user.setProfession(professions[i]);
            user.setLinkSite(emails[i]);
            user.setAboutMe(firstNames[i] + " " + lastNames[i] + ", " + cities[i]);
            user.setAvatar(firstNames[i] + " ☺");
            user.setIsEnable(true);

            if (i <= 25) {
                user.setRole(roleService.getRoleByName("ROLE_ADMIN"));
                user.setPassword(passwords[0]); //password - admin
            } else {
                user.setRole(roleService.getRoleByName("ROLE_USER"));
                user.setPassword(passwords[1]); //password - user
            }

            if (activeService.getById(1L).isPresent()) {
                user.setActive(activeService.getById(1L).get());
            } else {
                System.out.println("NET ACTIVE");
            }

            initUser(user);
        }
    }

    @PostConstruct
    public void fillTablesWithData() {
        setUsersWithRandomParameters();
    }
}