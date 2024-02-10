import java.util.ArrayList;
import java.util.List;

//Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable.
//Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток.
//Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator.
//Модифицировать класс Контроллер, добавив в него созданный сервис.
//Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков, путем вызова созданного сервиса.
public class Main {
    public static void main(String[] args) {
        List<StudeGroup> studeGroupList1 = new ArrayList<>();
        studeGroupList1.add(new StudeGroup("Group1"));
        studeGroupList1.add(new StudeGroup("Group2"));
        studeGroupList1.add(new StudeGroup("Group3"));
        studeGroupList1.add(new StudeGroup("Group4"));
        studeGroupList1.add(new StudeGroup("Group5"));
        studeGroupList1.add(new StudeGroup("Group6"));
        Stream stream1 = new Stream(studeGroupList1);

        List<StudeGroup> studeGroupList2 = new ArrayList<>();
        studeGroupList2.add(new StudeGroup("Group1"));
        studeGroupList2.add(new StudeGroup("Group2"));
        studeGroupList2.add(new StudeGroup("Group3"));
        studeGroupList2.add(new StudeGroup("Group4"));
        studeGroupList2.add(new StudeGroup("Group5"));
        Stream stream2 = new Stream(studeGroupList2);

        List<StudeGroup> studeGroupList3 = new ArrayList<>();
        studeGroupList3.add(new StudeGroup("Group1"));
        studeGroupList3.add(new StudeGroup("Group2"));
        studeGroupList3.add(new StudeGroup("Group3"));
        Stream stream3 = new Stream(studeGroupList3);

        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream1);
        streamList.add(stream2);
        streamList.add(stream3);

        StreamService service = new StreamService();
        service.sortStream(streamList);

        for (Stream stream : streamList) {
            System.out.println("Stream groups:");
            for (StudeGroup studeGroup : stream) {
                System.out.println(studeGroup);
            }
            System.out.println();
        }
    }

}