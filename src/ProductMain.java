import jdk.jshell.ImportSnippet;

import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class ProductMain {
    private static Object ProductMain;

    public static void main(String[] args) {
        List<Product> ProductLaptops = new ArrayList<>();
        List<LaptopsGame> Laptops = new ArrayList<>();
        ProductLaptops.add(new Product("Диагональ экрана"));
        ProductLaptops.add(new Product("Объем оперативной памяти (ОЗУ)"));
        ProductLaptops.add(new Product("Общий объем твердотельных накопителей (SSD)"));
        ProductLaptops.add(new Product("Модель процессора"));
        ProductLaptops.add(new Product("Операционная система"));
        ProductLaptops.add(new Product("Модель дискретной видеокарты"));
        ProductLaptops.add(new Product("Цвет"));
        Laptops.add(new LaptopsGame("MSI Katana B12VFK-463XRU", 15.6, 8, 512,
                "Intel", "Windows", "GeForce", "чёрный"));
        Laptops.add(new LaptopsGame("Apple MacBook Air", 13.3, 8, 256,
                "Apple", "Mac", "Apple", "серый"));
        Laptops.add(new LaptopsGame("AORUS 17 9SF", 17.3, 16, 1024,
                "Intel Core i5-12500H", "Linux", "GeForce", "чёрный"));
        Laptops.add(new LaptopsGame("ASUS VivoBook Pro M6500XU-MA082", 15.6, 32, 1000,
                "AMD", "Windows", "AMD", "серебристый"));
        Laptops.add(new LaptopsGame("MSI GE77 HX Raider 12UHS-085RU", 17.3, 64, 2000,
                "Intel", "Windows", "GeForce", "серый"));

//        Map<String, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Выберете цыфру, соответсвующую необходимому критерию для фильтрации");
            System.out.println("1 - Диагональ экрана");
            System.out.println("2 - Объем оперативной памяти (ОЗУ)");
            System.out.println("3 - Общий объем твердотельных накопителей (SSD)");
            System.out.println("4 - Модель процессора");
            System.out.println("5 - Операционная система");
            System.out.println("6 - Модель дискретной видеокарты");
            System.out.println("7 - Цвет");
            System.out.println("0 - Завершите выбор для вывода отфильтрованных ноутбуков");
//            choice = scanner.nextInt();
            try {
                choice = scanner.nextInt();
                if (choice == 0) {
                    System.out.println("Досвидания, всего хорошего!");
                    break;
                }
                switch (choice) {
                    case 1:
                        List<Product> filtersProduct1 = ProductLaptops.stream()
                                .filter(product -> product.getProduct().equals("Диагональ экрана"))
                                .toList();
                        for (Product product : filtersProduct1) {
                            int choiceScreenDiagonal;
                            while (true) {
                                System.out.println("Выберете Диагональ:");
                                System.out.println("1 - 13.3");
                                System.out.println("2 - 15.6");
                                System.out.println("3 - 17.3");
                                System.out.println("0 - Выбрать другой критерий");
                                choiceScreenDiagonal = scanner.nextInt();
                                if (choiceScreenDiagonal == 0) {
                                    break;
                                }
                                switch (choiceScreenDiagonal) {
                                    case 1:
                                        List<LaptopsGame> filteredLaptops1 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getScreenDiagonal() == 13.3)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops1) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 2:
                                        List<LaptopsGame> filteredLaptops2 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getScreenDiagonal() == 15.6)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops2) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 3:
                                        List<LaptopsGame> filteredLaptops3 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getScreenDiagonal() == 17.3)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops3) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    default:
                                        System.out.println("Неверный выбор. Попробуйте снова");
                                }
                            }
                        }
                        break;
                    case 2:
                        List<Product> filtersProduct2 = ProductLaptops.stream()
                                .filter(product -> product.getProduct().equals("Объем оперативной памяти (ОЗУ)"))
                                .toList();
                        for (Product product : filtersProduct2) {
                            int choiceScreenDiagonal;
                            while (true) {
                                System.out.println("Выберете объем оперативной памяти (ОЗУ):");
                                System.out.println("1 - 8");
                                System.out.println("2 - 16");
                                System.out.println("3 - 32");
                                System.out.println("4 - 64");
                                System.out.println("0 - Выбрать другой критерий");
                                choiceScreenDiagonal = scanner.nextInt();
                                if (choiceScreenDiagonal == 0) {
                                    break;
                                }
                                switch (choiceScreenDiagonal) {
                                    case 1:
                                        List<LaptopsGame> filteredLaptops1 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getRAM() == 8)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops1) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 2:
                                        List<LaptopsGame> filteredLaptops2 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getRAM() == 16)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops2) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 3:
                                        List<LaptopsGame> filteredLaptops3 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getRAM() == 32)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops3) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 4:
                                        List<LaptopsGame> filteredLaptops4 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getRAM() == 64)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops4) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    default:
                                        System.out.println("Неверный выбор. Попробуйте снова");
                                }
                            }
                        }
                        break;
                    case 3:
                        List<Product> filtersProduct3 = ProductLaptops.stream()
                                .filter(product -> product.getProduct().equals("Общий объем твердотельных накопителей (SSD)"))
                                .toList();
                        for (Product product : filtersProduct3) {
                            int choiceScreenDiagonal;
                            while (true) {
                                System.out.println("Выберете Общий объем твердотельных накопителей (SSD):");
                                System.out.println("1 - 256");
                                System.out.println("2 - 512");
                                System.out.println("3 - 1024");
                                System.out.println("4 - 2000");
                                System.out.println("0 - Выбрать другой критерий");
                                choiceScreenDiagonal = scanner.nextInt();
                                if (choiceScreenDiagonal == 0) {
                                    break;
                                }
                                switch (choiceScreenDiagonal) {
                                    case 1:
                                        List<LaptopsGame> filteredLaptops1 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getSSD() == 256)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops1) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 2:
                                        List<LaptopsGame> filteredLaptops2 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getSSD() == 512)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops2) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 3:
                                        List<LaptopsGame> filteredLaptops3 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getSSD() == 1024)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops3) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 4:
                                        List<LaptopsGame> filteredLaptops4 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getSSD() == 2000)
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops4) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    default:
                                        System.out.println("Неверный выбор. Попробуйте снова");
                                }
                            }
                        }
                        break;
                    case 4:
                        List<Product> filtersProduct4 = ProductLaptops.stream()
                                .filter(product -> product.getProduct().equals("Модель процессора"))
                                .toList();
                        for (Product product : filtersProduct4) {
                            int choiceScreenDiagonal;
                            while (true) {
                                System.out.println("Выберете модель процессора:");
                                System.out.println("1 - Intel");
                                System.out.println("2 - AMD");
                                System.out.println("3 - Apple");
                                System.out.println("0 - Выбрать другой критерий");
                                choiceScreenDiagonal = scanner.nextInt();
                                if (choiceScreenDiagonal == 0) {
                                    break;
                                }
                                switch (choiceScreenDiagonal) {
                                    case 1:
                                        List<LaptopsGame> filteredLaptops1 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getProcessorModel().equals("Intel"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops1) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 2:
                                        List<LaptopsGame> filteredLaptops2 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getProcessorModel().equals("AMD"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops2) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 3:
                                        List<LaptopsGame> filteredLaptops3 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getProcessorModel().equals("Apple"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops3) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    default:
                                        System.out.println("Неверный выбор. Попробуйте снова");
                                }
                            }
                        }
                        break;
                    case 5:
                        List<Product> filtersProduct5 = ProductLaptops.stream()
                                .filter(product -> product.getProduct().equals("Операционная система"))
                                .toList();
                        for (Product product : filtersProduct5) {
                            int choiceScreenDiagonal;
                            while (true) {
                                System.out.println("Выберете Операционную систему:");
                                System.out.println("1 - Windows");
                                System.out.println("2 - Linux");
                                System.out.println("3 - Mac");
                                System.out.println("0 - Выбрать другой критерий");
                                choiceScreenDiagonal = scanner.nextInt();
                                if (choiceScreenDiagonal == 0) {
                                    break;
                                }
                                switch (choiceScreenDiagonal) {
                                    case 1:
                                        List<LaptopsGame> filteredLaptops1 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getOs().equals("Windows"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops1) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 2:
                                        List<LaptopsGame> filteredLaptops2 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getOs().equals("Linux"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops2) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 3:
                                        List<LaptopsGame> filteredLaptops3 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getOs().equals("Mac"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops3) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    default:
                                        System.out.println("Неверный выбор. Попробуйте снова");
                                }
                            }
                        }
                        break;
                    case 6:
                        List<Product> filtersProduct6 = ProductLaptops.stream()
                                .filter(product -> product.getProduct().equals("Операционная система"))
                                .toList();
                        for (Product product : filtersProduct6) {
                            int choiceScreenDiagonal;
                            while (true) {
                                System.out.println("Выберете модель дискретной видеокарты:");
                                System.out.println("1 - GeForce");
                                System.out.println("2 - AMD");
                                System.out.println("3 - Apple");
                                System.out.println("0 - Выбрать другой критерий");
                                choiceScreenDiagonal = scanner.nextInt();
                                if (choiceScreenDiagonal == 0) {
                                    break;
                                }
                                switch (choiceScreenDiagonal) {
                                    case 1:
                                        List<LaptopsGame> filteredLaptops1 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getVideoCardModel().equals("GeForce"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops1) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 2:
                                        List<LaptopsGame> filteredLaptops2 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getVideoCardModel().equals("AMD"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops2) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 3:
                                        List<LaptopsGame> filteredLaptops3 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getVideoCardModel().equals("Apple"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops3) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    default:
                                        System.out.println("Неверный выбор. Попробуйте снова");
                                }
                            }
                        }
                        break;
                    case 7:
                        List<Product> filtersProduct7 = ProductLaptops.stream()
                                .filter(product -> product.getProduct().equals("Цвет"))
                                .toList();
                        for (Product product : filtersProduct7) {
                            int choiceScreenDiagonal;
                            while (true) {
                                System.out.println("Выберете цвет:");
                                System.out.println("1 - чёрный");
                                System.out.println("2 - серый");
                                System.out.println("3 - серебристый");
                                System.out.println("0 - Выбрать другой критерий");
                                choiceScreenDiagonal = scanner.nextInt();
                                if (choiceScreenDiagonal == 0) {
                                    break;
                                }
                                switch (choiceScreenDiagonal) {
                                    case 1:
                                        List<LaptopsGame> filteredLaptops1 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getColor().equals("чёрный"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops1) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 2:
                                        List<LaptopsGame> filteredLaptops2 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getColor().equals("серый"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops2) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    case 3:
                                        List<LaptopsGame> filteredLaptops3 = Laptops.stream()
                                                .filter(laptopsGame -> laptopsGame.getColor().equals("серебристый"))
                                                .toList();
                                        System.out.println("Отфильтрованные игровые ноутбуки");
                                        for (LaptopsGame laptopsGame : filteredLaptops3) {
                                            System.out.println(laptopsGame);
                                        }
                                        break;
                                    default:
                                        System.out.println("Неверный выбор. Попробуйте снова");
                                }
                            }
                        }
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Неверный ввод. Попробуй снова");
                break;
            }
        }
    }
}


//                        LaptopsMain myClassObject = new LaptopsMain() {
//                            @Override
//                            public String toString() {
//                                return super.toString();
//                            }
//
//                            @Override
//                            public boolean equals(Object obj) {
//                                return super.equals(obj);
//                            }
//                        };
//                        myClassObject.main(ProductMain);