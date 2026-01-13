//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    String day = scanner.nextLine().toUpperCase();

    Days days = Days.valueOf(day);

    switch (days) {
        case MONDAY:
            System.out.println(" Дуйшомбу куну Java болот ");
            break;
        case TUESDAY:
            System.out.println(" Шейшемби куну session болот ");
            break;
        case WEDNESDAY:
            System.out.println(" Шаршемби англис тил бар ");
            break;
        case THURSDAY:
            System.out.println("Бейшемби зал ");
        case FRIDAY:
            System.out.println("Жума куну жумага барам ");
        case SATURDAY:
            System.out.println("Тапшырмаларды кайталоо ");
        case SUNDAY:
            System.out.println("Эс алуу ");
            break;
        default:


    }

}
