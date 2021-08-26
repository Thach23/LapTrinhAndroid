package com.example.doan_appdaynauan;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Utils {
    Context context;
    static String filename="database";
    static ArrayList<foodForGV> foodFavorite = new ArrayList<>();

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Utils(Context context) {
        this.context = context;
    }

    public void WriteToFileInternal(ArrayList<foodForGV> arrayList){
        try {
            File file = new File(context.getFilesDir(), filename);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new
                    ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<foodForGV> LoadFileInternal(){
        ArrayList<foodForGV> arrayList = new ArrayList<>();
        try {
            File file = new File(context.getFilesDir(), filename);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new
                    ObjectInputStream(fileInputStream);
            arrayList = (ArrayList<foodForGV>)
                    objectInputStream.readObject();
            Log.d("FurnitureApp", arrayList.size()+"");
            return arrayList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<foodForGV> getFavoritefood()
    {
        return  this.foodFavorite;
    }

    public ArrayList<foodForGV> initFoodForGV1_Ultis()
    {
        String a = new String();

        ArrayList<foodForGV> tmp = new ArrayList<>();
        tmp.add(new foodForGV("Bún chả cá Nha Trang",
                "Được thiên nhiên ưu ái cho một vùng biển rộng lớn, nước biển trong xanh với những bờ cát vàng. Nha Trang luôn được bình chọn là một trong những bãi biển đẹp nhất thế giới. Bên cạnh đó, sự trù phú của hải sản đã đem lại cho văn hóa ẩm thực Nha Trang đậm đà hương vị biển. Bún chả cá góp phần xây dựng nên bản sắc biển ấy.",
                "\nCá thu hoặc cá thác lác 1 kg" +
                        "        \n" +
                        "        \nBún cọng nhỏ 500gram" +
                        "        \n" +
                        "        \nHành tím, hành lá, tỏi, ớt, chanh" +
                        "        \n" +
                        "        \nRau muống bào, bông chuối bào, rau húng quế, giá sống" +
                        "        \n" +
                        "        \nThơm ½ trái.Cà chua 3 trái" +
                        "        \n" +
                        "        \nGia vị: nước mắm, muối, bột ngọt, bột nêm, tiêu, dầu ăn…Nước lọc" +
                        "        \n",
                "Bước 1:Cá thu làm sạch, rửa sạch rồi để ráo nước. Nạo lấy phần thịt cá, những phần còn lại để nấu nước dùng.\n" +
                        "\n" +
                        "Bước 2: Các loại rau, củ bạn ngâm nước muối loãng, rửa sạch, để ráo nước. Cà chua cắt múi cao. Thơm gọt vỏ, bỏ mắt, cắt làm đôi hoặc làm ba để nấu nước dùng.\n" +
                        "\n" +
                        "Hành tím nướng 3 – 4 củ để bỏ vào nước dùng cho thơm, còn lại băm nhuyễn. Tỏi đập dập, băm nhuyễn. Hành lá cắt nhuyễn.\n" +
                        "\n" +
                        "Bước 3: Giã hoặc xay cá cho mịn vừa phải. Cho ra âu, sau đó, nêm 1 muỗng cà phê muối, 1/3 muỗng cà phê hạt nêm, 1/3 muỗng cà phê tiêu, chút xíu nước mắm, dầu ăn, hành lá vào cùng, dùng muỗng quết cho thật nhuyễn và dai. Khi bóp thử bạn thấy chả cá dính chặt vào nhau là được.\n" +
                        "\n" +
                        "Bước 4:Trong khi quết chả cá thì nấu nước dùng: Ướp đầu cá, xương cá…với một ít bột ngọt, muối, tiêu, hành băm. Bạn có thể xào sơ cho đỡ mùi tanh. Đổ nước xăm xắp mặt cá, cho hành nướng thơm vào và đun lửa liu riu.(Bí quyết cho bạn là hành nướng làm tăng mùi vị của nước dùng, át đi mùi tanh của cá thịt. Khi nấu bất cứ loại nước dùng nào cũng nên cho thêm hành nướng, tỏi nướng vào nấu cùng)\n" +
                        "\n" +
                        "Bước 5:Cà chua xào sơ với dầu nóng để tạo màu tự nhiên cho nước dùng. Nêm một ít muối, bột nêm trước khi xào, bạn lưu ý chỉ xào sơ chứ không xào chín nát.\n" +
                        "\n" +
                        "Bước 6: Khi nước cạn thì châm thêm nước lần 2. Khi thấy đầu cá, xương cá rục thì vớt xác bỏ đi. Châm thêm một lượng nước vừa ăn vào nước dùng, bỏ thơm vào đun sôi.\n" +
                        "\n" +
                        "Bước 7: Chả cá bạn chia làm 2 loại: chiên và hấp ( hoặc vo thành viên nấu với nước dùng)\n" +
                        "\n" +
                        "Chả cá viên: bạn nặn hình khối chữ nhật, dày khoảng 2cm. Đun sôi dầu và cho chả cá vào chiên chín. Sau đó bạn cắt lát vừa ăn.",
                "bun_cha_ca_nha_trang.jpg",1));
        tmp.add(new foodForGV("Bún thịt nướng",
                "Những ngày cuối năm, khi thời tiết dần se lạnh thì cũng chính là lúc các món nướng được mọi người thường xuyên dùng đến. Đặc biệt là vào buổi sáng tinh mơ, khi các giọt sương còn đọng trên lá và bạn đang chuẩn bị mọi thứ cho một ngày làm việc vất vả thì bữa ăn sáng lại là một thứ gì đó thúc đẩy tinh thần bạn. Nếu như bạn đang không biết phải nấu món gì cho bữa sáng những ngày cuối năm thì hãy cùng bọn mình học cách làm bún thịt nướng ngon đơn giản ngay tại nhà sau đây nhé. Chắc hẳn món ăn này sẽ cung cấp năng lượng cho một ngày làm việc vất vả của bạn đấy. Giờ hãy vào bếp cùng chúng tôi ngay nào.",
                "Thịt heo ½ kg\n" +
                        "        \n" +
                        "        Sả 1 nhánh\n" +
                        "        \n" +
                        "        Tỏi 3 tép\n" +
                        "        \n" +
                        "        Hành lá 2 nhánh\n" +
                        "        \n" +
                        "        Gia vị nêm: nước mắm, xì dầu, dầu hào, tiêu, đường, dầu ăn, mật ong\n" +
                        "        \n" +
                        "        Bún tươi 1 kg\n" +
                        "        \n" +
                        "        Các loại rau: xà lách, dưa leo, đồ chua, rau thơm\n" +
                        "        \n" +
                        "        Đậu phộng rang\n" +
                        "        \n" +
                        "        Mỡ hành\n" +
                        "        \n" +
                        "        Thịt heo bạn loại loại nạc vai, rửa sạch qua nước muối pha loãng rồi cắt miếng dày vừa ăn. Dùng dao lớn dần miếng thịt cho mềm. Ướp với 1/2 muỗng cà phê tiêu, 2 muỗng canh xì dầu, 1 muỗng canh nước mắm, 2 muỗng canh dầu hào, 1 muỗng canh đường (nếu có đường nâu thì càng tốt), 2 muỗng canh dầu ăn, 1 muỗng canh dầu ăn, 1 muỗng canh mật ong. Trộn đều tất cả lên, để trong vòng 1- 2 tiếng cho thịt heo ngấm đều gia vị.",
                "Bước 1:Làm bún thịt nướng\n" +
                        "         \n" +
                        "Bạn nướng thịt bằng lò nướng hoặc lò than đều được nhé. Cách nướng cũng giống nhau như nếu nướng bằng bếp than thịt sẽ thơm ngon hơn\n" +
                        " \n" +
                        "Nếu nướng bằng lò nướng, bạn cần làm nóng lò trước 10 phút rồi mới cho thịt vừa ướp vào nướng. Nhớ canh cho thịt được nướng chín đều hai mặt.\n" +
                        " \n" +
                        "Nướng trên bếp than thì điều cần lưu ý là trở đều để thịt không bị cháy khét. Trong quá trình nướng bạn nhớ phết phần sốt ướp lên trên miếng thịt để thịt được sáng đều màu, nhìn hấp dẫn hơn.\n" +
                        " \n" +
                        "Bước 2:Làm nước chấm ngon\n" +
                        "         \n" +
                        "Pha nước chẩm theo tỉ lệ vàng như sau:\n" +
                        "         \n" +
                        " – 2 muỗng canh nước mắm.\n" +
                        "         \n" +
                        " – 2 muỗng canh cốt chanh.\n" +
                        "         \n" +
                        " – 2 muỗng canh đường.\n" +
                        "         \n" +
                        " – 4 muỗng canh nước lọc.\n" +
                        "         \n" +
                        " – 2 muỗng café tỏi, ớt băm nhuyễn, khuấy đều.\n" +
                        " \n" +
                        "Cho bún tươi ra tô, để 1 phần rau lên trên cùng với thịt vừa nướng, chan nước mắm chua ngọt, mỡ hành lên trên và dùng nóng\n" +
                        " \n" +
                        "Vậy là chúng tôi đã hướng dẫn bạn xong cách làm bún thịt nướng để bạn chiêu đãi cả nhà vào buổi sáng rồi.",
                "bun_thit_nuong.jpg",2));
        tmp.add(new foodForGV("Canh Kim Chi Sườn Non",
                "Trong tiết trời se lạnh cuối năm, với vị cay cay xen lẫn chua dịu của kim chi thì không ai có thể từ chối được món canh kim chi sườn non ngon tuyệt xuất hiện trong mỗi bữa cơm cùng gia đình. Vậy các bạn đã có sẵn cho mình một công thức chuẩn để học cách nấu món canh kim chi này chưa. Ngày hôm nay, hãy cùng bọn mình vào bếp để học cách nấu canh kim chi sườn non ngon tuyệt mà lại đơn giản này nhé.",
                "Kim chi cải thảo 200gr.\n" +
                        "         \n" +
                        "        Sườn non 200gr.\n" +
                        "         \n" +
                        "        Nấm kim châm 100gr.\n" +
                        "         \n" +
                        "        Đậu phụ non 2 bìa.\n" +
                        "         \n" +
                        "        Tàu hủ ki 1 miếng.\n" +
                        "         \n" +
                        "        Nấm hương 3 cái.\n" +
                        "         \n" +
                        "        Hành lá, hành tím.\n" +
                        "         \n" +
                        "        Gia vị: Đường, muối.",
                "Bước 1: Hành lá bạn nhặt sạch rễ, rửa sạch và cắt thành khúc. Hành tím đem bóc bỏ vỏ, băm nhuyễn.\n" +
                        " \n" +
                        "Bước 2: Sườn non bạn rửa sạch, trụng qua nước sôi 1 lần cho sạch bụi bẩn rồi để ráo nước. Nấm hương và tủ hủ ky ngâm nước cho nở mềm.\n" +
                        " \n" +
                        "Bước 3: Kim chi cải thảo bạn đem vắt khô hết nước và cắt thành miếng nhỏ. Đậu phụ non bạn đem cắt thành từng miếng vuông nhỏ vừa ăn.\n" +
                        " \n" +
                        "Bước 4: Đặt nồi lên bếp, đun sôi dầu ăn rồi cho hành tím đã băm nhỏ vào phi thơm. Tiếp theo, bạn cho sườn non và kim chi vào đảo đều tay để kim chi được ngấm, đổ nước xăm xắp mặt, đậy nắp lại đun sôi lên.\n" +
                        " \n" +
                        "Bạn đun cho đến khi nước sôi thì cho đậu phụ non, nấm hương, tàu hủ ky, nấm kim châm vào và đảo thật đều, nhẹ tay để đậu không bị nát.\n" +
                        " \n" +
                        "Bước 5: Bạn đợi cho nồi canh sôi nhẹ rồi bạn nêm canh lại cho vừa ăn, thêm hành lá, đảo nhẹ rồi tắt bếp.\n" +
                        " \n" +
                        "Cuối cùng, bạn bắc nồi canh kim chi xuống, múc ra thố có nắp đậy để canh nóng lâu, dùng nóng với cơm trắng.",
                "canh_kim_chi_suon_non.jpg",3));
        tmp.add(new foodForGV("Gà kho sả ớt",
                "Gà kho sả ớt là món ăn quen thuộc và phổ biến với nhiều gia đình Việt. Tuy vậy, không hẳn ai cũng biết cách làm món ăn này thật ngon và không bị ngán. Cách làm gà kho sả ớt này rất đơn giản, không quá cầu kỳ, các nguyên liệu dễ chuẩn bị, vì vậy mà ngày hôm nay bọn mình xin hướng dẫn các chị em cách làm gà kho sả ớt thơm ngon đậm đà miễn chê. Thịt gà thì mềm mềm, thấm gia vị, thơm mùi sả và cay cay vị ớt, kích thích các vị giác nhanh chóng.",
                "500 gr thịt gà (có thể chọn bắp đùi gà)\n" +
                        "         \n" +
                        "        2 cây sả\n" +
                        "         \n" +
                        "        3 quả ớt hiểm\n" +
                        "         \n" +
                        "        1 củ tỏi\n" +
                        "         \n" +
                        "        Gia vị gồm muối, đường, tiêu và nước mắm\n" +
                        "         \n" +
                        "        Dầu ăn",
                "Bước 1: Bước sơ chế bạn cần làm sạch thịt gà, rửa sạch, chặt thành từng miến nhỏ, đem ướp với 2 thìa café nước mắm, 1 thìa café muối, 1 thìa café đường, 1 ít hạt tiêu. Trộn đều và để khoảng 15 phút là thịt ngấm gia vị.\n" +
                        " \n" +
                        "Sả và ớt được băm nhỏ.\n" +
                        " \n" +
                        "Bước 2: Cho dầu ăn vào chảo đun sôi, vặn lửa vừa và khuấy cho đường tan chuyển thành màu nâu vàng.\n" +
                        " \n" +
                        "Bước 3: Tiếp theo, cho hành băm nhỏ trước đó vào đảo sơ qua, cho thịt gà vào xào. Đảo đều tay trong 5 phút là trút sả, ớt vào.\n" +
                        " \n" +
                        "Bước 4: Bây giờ, vặn nhỏ lửa, đậy vung lại và đun nhỏ lửa trong 10 phút để gà được chín mềm. Bạn lưu ý là trong khi đun thịt gà thì thỉnh thoảng mở vung đảo nhẹ nhàng để gà không bị cháy và được ngấm đều gia vị.\n" +
                        " \n" +
                        "Bước 5: Cuối cùng bạn chỉ cần nêm lại gia vị vừa miệng rồi tắt bếp, cho thịt gà ra dĩa rồi dọn lên mâm.\n" +
                        " \n" +
                        "Gà kho sả ớt ăn với cơm nóng ngon tuyệt vời, ai đã thử một lần là thích mê mệt luôn đấy nhé.",
                "ga_kho_sa_ot.jpg",4));
        tmp.add(new foodForGV("Há cảo hấp tôm thịt",
                "Há cảo ngày nay có rất nhiều loại vì Đầu Bếp có thể thay đổi nhân bên trong với nhiều loại nguyên liệu khác nhau. Và hôm nay, daubepgiadinh.vn sẽ hướng dẫn bạn cách làm há cảo tôm thịt đơn giản và dễ làm nhất, cùng theo dõi nhé.",
                "1. Vỏ bánh:\n" +
                        "\n" +
                        "    Bột năng 100 gram\n" +
                        "         \n" +
                        "    Bột gạo 100 gram\n" +
                        "         \n" +
                        "    Hoặc bạn có thể dùng 200 gram bột há cảo pha sẵn với 1/2 muỗng muối\n" +
                        "         \n" +
                        "2. Nhân bánh:\n" +
                        " \n" +
                        "Thịt nạc dăm băm nhuyễn 150gram Tôm tươi băm nhuyễn 150 gramNấm mèo 4 tai Hành tím băm nhuyễn 5 tépHành lá băm nhuyễn Cà rốt 1 củ nhỏ, cắt hạt lựuGia vị: muối, tiêu, hạt nêm",
                "Bước 1: Làm vỏ bánh : hòa tan bột năng, bột gạo cùng với 200ml nước sôi và một chút muối, khuấy đều cho đến khi nước nguội bớt thì dùng tay nhào bột. Bạn nhào khoảng 5 phút đến khi bột thật dẻo và mịn rồi ủ bột khoảng 20 phút.\n" +
                        " \n" +
                        "Tốt nhất bạn nên hòa tan 2/3 lượng bột cùng với nước trước, từ từ điều chỉnh lượng bột và nước trong quá trình nhào bột để đảm bảo rằng thành phẩm là khối bột dẻo mịn, không dính tay là được.\n" +
                        " \n" +
                        "Bước 2: Nhân bánh: Trộn tất cả các nguyên liệu để làm nhân bánh vào cùng với nhau, nêm nếm gia vị cho vừa ăn.\n" +
                        " \n" +
                        "Bước 3: Sau khi ủ bột xong, bạn cắt bột thành những cục nhỏ khoảng 2cm.\n" +
                        " \n" +
                        "Bước 4: Cán bột thành miếng mỏng, hình tròn, có độ dày vừa phải. Cho 1 muỗng nhân vào giữa miếng bột và túm miếng bột lại, dùng ngón trỏ và ngón cái bóp nhẹ từng mép bánh và dán chồng lên nhau.\n" +
                        " \n" +
                        "Bước 5: Cho há cảo đã làm xong vào xửng hấp trong vòng 5-10 phút, khi nhìn thấy vỏ bánh trong là bánh chín.\n" +
                        " \n" +
                        "Vậy là chúng tôi đã hướng dẫn xong cho bạn cách làm há cảo tôm thịt rồi. Thật đơn giản đúng không nào?\n" +
                        " \n" +
                        "Chúc bạn thành công khi thực hiện.",
                "ha_cao_hap_tom_thit.jpg",5));
        tmp.add(new foodForGV("Đu đủ tiềm táo đỏ",
                "Món đu đủ tiềm táo đỏ của người Hoa không chỉ tốt cho sức khỏe, giúp da khỏe đẹp mà còn rất đặc biệt vì có thể ăn nóng khi trời trở lạnh và ăn cùng đá lạnh trong những ngày nóng nực.",
                "Đu đủ vừa chín tới nửa quả\n" +
                        "    \n" +
                        "   Táo đỏ 60gr\n" +
                        " \n" +
                        "   Nấm tuyết 10gr\n" +
                        "  \n" +
                        "   Đường phèn 250gr\n" +
                        "  \n" +
                        "   Nước 1 lít\n" +
                        " \n" +
                        "           Sơ chế nguyên liệu : Nấm tuyết ngâm nước cho nở mềm, cắt bỏ phần gốc rồi cắt miếng vừa ăn. Đu đủ gọt vỏ, bỏ hạt, rửa sạch để ráo rồi cắt miếng vừa ăn.Táo đỏ rửa thật sạch bui bẩn rồi mới cho vào nước ngâm mềm vì ngâm xong là dùng luôn nước ngâm.\n" +
                        "    ",
                "   Bước 1: Bước đầu tiên, bạn trộn đu đủ với táo đỏ và nấm tuyết\n" +
                        " \n" +
                        "   Bước 2: Tiếp theo, bạn cho 1 lít nước và đường phèn vào nồi nấu cho đường tan (1 lít nước này tính luôn cả nước ngâm táo đỏ).\n" +
                        " \n" +
                        "   Bước 3: Nấu xong nước đường phèn bạn cho vào nồi hỗn hợp đu đủ, nấm tuyết và táo đỏ.\n" +
                        " \n" +
                        "   Bước 4: Sau đó, bạn đem hỗn hợp đu đủ đã cho nước phèn đi hấp cách thủy 15 phút nữa là được.\n" +
                        " \n" +
                        "   Sau khi hấp xong, bạn lấy đu đủ tiềm táo đỏ ra ngoài, nếu dùng nóng thì bạn để hơi nguội thì có thể dùng ngay, nếu dùng lạnh bạn để thật nguội rồi cho đá viên vào",
                "du_du_tiem_tao_do.jpg",6));
        tmp.add(new foodForGV("Móng giò hầm khoai tây",
                "Những ngày bận rộn, suy nghĩ mãi mà không biết nên nấu món gì có thể ăn với cơm, ăn với bún hoặc ăn không vừa ngon vừa bổ dưỡng thì các món hầm như: chân giò hầm rau củ, móng giò hầm khoai sọ, móng giò hầm hạt sen, đặc biệt là món móng giò hầm khoai tây là gợi ý dành cho bạn. Chỉ cần mua nguyên liệu về sơ chế, đem hầm trong nồi áp suất hay nồi canh vài tiếng là đã có món ăn cả nhà đều thích. Để nấu được vị chuẩn nhất, bạn hãy lưu lại công thức làm móng giò hầm khoai tây mà chúng tôi hướng dẫn dưới đây nhé!",
                "Móng giò: 300gr\n" +
                        " \n" +
                        "Khoai tây: 3 – 4 củ\n" +
                        " \n" +
                        "Cà rốt: 2 củ\n" +
                        " \n" +
                        "Hành tây: 1 củ\n" +
                        "  \n" +
                        "Khoai lang: 1 củ\n" +
                        " \n" +
                        "Cà chua: 2 quả\n" +
                        " \n" +
                        "Hành lá\n" +
                        "  \n" +
                        "Rau mùi\n" +
                        " \n" +
                        "Gia vị: muối, hạt nêm, bột ngọt, tiêu\n",
                "Bước 1: Sơ chế các nguyên liệu\n" +
                        " \n" +
                        "        Móng giò làm sạch, xát muối, rửa sạch và chặt thành từng khúc nhỏ\n" +
                        " \n" +
                        "        Cho móng giò vào nồi, đổ nước xâp xấp và đun sôi. Tiếp đến, bạn đổ ra rổ rửa sạch. Cho móng giò vào nồi, thay nước mới và hầm.\n" +
                        " \n" +
                        "        Khoai tây, khoai lang, cà rốt, hành tây gọt vỏ, rửa sạch, cắt thành từng khúc nhỏ.\n" +
                        " \n" +
                        "        Hành lá rửa sạch, rau mùi rửa bỏ rễ sau đó cắt nhỏ.\n" +
                        " \n" +
                        "        Bước 2: Hầm chân giò và rau củ\n" +
                        " \n" +
                        "        Khi chân giò sôi, bạn cho khoai tây, cà rốt, hành tây, khoai lang vào và tiếp tục hầm cho đến khi các nguyên liệu chín mềm nhừ.\n" +
                        " \n" +
                        "        Nêm nếm lại gia vị cho vừa miệng rồi tắt bếp.\n" +
                        " \n" +
                        "        Bước 3: Thưởng thức món chân giò hầm khoai tây\n" +
                        " \n" +
                        "        Múc chân giò hầm khoai tây ra tô, thêm chút hành ngò và tiêu lên trên cùng rồi ăn cùng bún, cơm nóng hoặc ăn không đều rất ngon.\n" +
                        " \n" +
                        "        Nếu cho bé ăn, bạn có thể lấy khoai, cà rốt và các loại củ ra xay nhuyễn cho bé dễ ăn hơn nhé.\n" +
                        " \n" +
                        "        Một số lưu ý khi làm chân giòn hầm khoai tây:\n" +
                        " \n" +
                        "        Các nguyên liệu rau củ bạn có thể thay đổi tùy theo sở thích của gia đình như: thêm củ cải, su hào, thêm chút dứa,…\n" +
                        " \n" +
                        "        Hành tây cho vào nước dùng hầm là để nước thơm và ngọt hơn, nếu không thích ăn hành tây bạn có thể không thêm vào hoặc cho vào hầm nhưng vớt xác hành tây ra khi hầm xong.\n" +
                        " \n" +
                        "        Nên thêm khoai lang để cho trẻ ăn dễ tiêu hóa và kích thích vị giác của con trẻ",
                "mong_gio_khoai_tay.jpg",7));
        tmp.add(new foodForGV("Gà tiềm thuốc bắc",
                "Gà tiềm thuốc bắc là một món ăn bổ dưỡng, giúp bồi bổ sức khỏe, đặc biệt tốt cho bà bầu, người ốm và giúp phòng tránh các bệnh cho thời tiết.\n" +
                        "     \n" +
                        "Hơn nữa, gà tiềm thuốc bắc vô cùng thơm ngon với mùi thơm dễ chịu và vị ngọt của thuốc bắc hòa cùng với nước cốt gà đậm đà. Công thức nấu món ăn này lại vô cùng đơn giản, vậy sao bạn lại không tự tay bồi bổ cho gia đình mình nhỉ. Cùng vào bếp với daubepgiadinh.vn để tìm hiểu công thức làm món gà tiềm thuốc bắc này nhé.\n",
                "Gà ta 1 con\n" +
                        "  \n" +
                        "Cây kỉ tử khô 15gr\n" +
                        " \n" +
                        "Táo đỏ 100gr\n" +
                        " \n" +
                        "Nấm tuyết 200gr\n" +
                        "  \n" +
                        "Thuốc bắc (dùng trong nấu ăn) 1 gói\n" +
                        "  \n" +
                        "Muối 1 muỗng cà phê\n" +
                        "  \n" +
                        "Bột ngọt 1/2 muỗng cà phê\n" +
                        "  \n" +
                        "Gừng tươi 1/2 miếng\n" +
                        " \n" +
                        "Tiêu 1/2 muỗng cà phê\n" +
                        " \n" +
                        "Hạt nêm 1/2 muỗng cà phê\n",
                "Bước 1: Sơ chế nguyên liệu\n" +
                        " \n" +
                        "Nấm tuyết ngâm nước lạnh cho nở mềm rồi cắt thành những miếng vừa ăn. Táo tàu rửa sạch rồi ngâm nở.\n" +
                        " \n" +
                        "Gà mua về rửa sạch rồi sát muối ngoài mình gà và xả lại bằng nước lạnh.\n" +
                        " \n" +
                        "Lấy các vị thuốc trong gói thuốc bắc ra rửa sạch rồi sắt khúc những phần dài.\n" +
                        " \n" +
                        "Bước 2: Chiên gà\n" +
                        " \n" +
                        "Bắc chảo sâu lòng lên bếp, đổ thật nhiều dầu vào đun sôi, cho nguyên con gà vào chiên thật vàng giòn sau đó vớt ra.\n" +
                        " \n" +
                        "Bước 3: Hầm gà\n" +
                        " \n" +
                        "Đổ khoảng 500ml nước vào nồi đất, cho gà, nấm tuyết, táo tàu, gừng tươi và các loại thuốc bắc, nêm thêm muối, bột ngọt, muối, bột nêm, đường vào và hầm trong vòng 1 – 2 tiếng (hoặc dùng nồi áp suất để ninh)\n" +
                        " \n" +
                        "Sau khi hầm gà sau, bạn chuẩn bị thêm đĩa muối tiêu chanh rồi múc gà tiềm thuốc bắc ra chén và thưởng thức nóng.\n" +
                        " \n" +
                        "Gà tiềm thuốc bắc một món ăn vừa thơm ngon vừa hấp dẫn, thịt gà mềm đậm đà hương vị thuốc bắc, giúp bồi bổ sức khỏe cho tất cả mọi người sẽ giúp bạn ghi điểm trong mắt cả nhà đấy nhé.\n" +
                        " \n" +
                        "Chúc bạn thành công khi thực hiện.",
                "ga_tiem_thuoc_bac.jpg",8));
        tmp.add(new foodForGV("Sườn Bò Hầm",
                "Các món ăn từ sườn bò hầm vừa có hương vị thơm ngon vừa là nguồn cung cấp các chất dinh dưỡng cần thiết cho cơ thể. Vì vậy, đây là món ăn được nhiều gia đình ưa chuộng. Các bà nội trợ thường tìm hiểu nhiều cách nấu sườn bò hầm khác nhau để đổi vị cho gia đình.\n" +
                        "     \n" +
                        "        Hiểu được nhu cầu này, hôm nay Bếp Gia Đình – Hướng Nghiệp Á Âu xin gửi đến bạn hai cách nấu sườn bò hầm, bao gồm: sườn bò hầm sả và sườn bò hầm kim chi. Mời bạn theo dõi và lưu lại những bí quyết nấu ăn đặc biệt này nhé!\n" +
                        " ",
                " • Sườn bò: 500gram\n" +
                        " \n" +
                        " • Sả: 200gram\n" +
                        " \n" +
                        " • Ớt hiểm: 2 – 3 trái\n" +
                        " \n" +
                        " • Gừng: 50gram\n" +
                        " \n" +
                        " • Đậu phộng: 50gram\n" +
                        " \n" +
                        " • Muối, đường, dầu ăn, bột ngọt\n" +
                        " \n" +
                        " • Nước cốt dừa tươi",
                "Bước 1: Sườn bò mua về bạn rửa qua nước muối pha loãng để khử mùi hôi rồi để ráo nước. Sả cây lột lớp vỏ già, rửa sạch, để ráo và băm nhuyễn. Ớt hiểm rửa sạch, bỏ cuống, cắt nhỏ. Hành tím, tỏi lột vỏ rồi băm nhuyễn. Gừng gột vỏ, rửa sạch và đập dập. Đậu phộng rang chín, bóc vỏ và giã nhỏ.\n" +
                        " \n" +
                        "Bước 2: Đặt nồi lên bếp, đun nước sôi với một ít gừng đập dập rồi cho sườn bò vào luộc khoảng 3 phút. Kế tiếp bạn vớt sườn ra rổ, xả nước nguội rồi cắt miếng vuông dày khoảng 3cm. Chần sườn bò là bí quyết giúp cho nước dùng của món ăn trong và thơm hơn.\n" +
                        " \n" +
                        "Sườn bò sau khi cắt ướp với ½ muỗng cà phê muối, 1 muỗng cà phê đường, ½ muỗng cà phê hạt nêm, ½ muỗng cà phê bột ngọt, 1 xíu nước mắm cùng hành, tỏi băm nhỏ, đảo đều và ướp trong 30 phút cho thịt ngấm gia vị.\n" +
                        " \n" +
                        "Bước 3: Đặt nồi lên bếp, đun sôi 2 muỗng canh dầu ăn rồi cho sả, ớt vào phi thơm. Khi sả và ớt dậy mùi thì cho sườn bò đã ướp vào đảo đều tay trên lửa lớn. Sườn bò xào 2 phút thì tắt bếp, bạn cho vào nồi và hầm với nước dừa tươi.\n" +
                        " \n" +
                        "Trong quá trình hầm, bạn để lửa vừa, cho thêm sả cây đập dập, hầm cho đến khi nước dừa cạn, thịt mềm vừa ăn thì bạn vặn nhỏ lửa, nêm nếm lại gia vị. Cuối cùng, cho nước cốt dừa vào đảo đều một lần nữa thì tắt bếp là hoàn thành món ăn.\n" +
                        " \n" +
                        "Món sườn bò hầm sả dùng với cơm nóng hoặc bánh mì đều ngon, bạn nhé!",
                "suon_bo_ham.jpg",9));
        return tmp;
    }

    public  ArrayList<foodForGV> initFoodForGV2_Ultis()
    {
        ArrayList<foodForGV> tmp = new ArrayList<>();
        tmp.add(new foodForGV("Nước ép bưởi giảm cân" ,
                "Uống nước ép bưởi giảm cân là một trong những phương pháp để giảm cân lành mạnh được nhiều người áp dụng thành công. Tuy nhiên, bạn cần nắm rõ các nguyên tắc làm nước ép bưởi và thời điểm uống nước ép bưởi để giải pháp giảm cân thực sự đem lại hiệu quả.\n" +
                        "Công thức làm nước ép bưởi để uống hàng ngày sẽ giúp bạn vừa có một ly nước uống thơm ngon, vừa giúp giữ dáng, đẹp da.",
                "1 quả bưởi\n" +
                        " \n" +
                        "Máy xay sinh tố hoặc máy ép trái cây.\n" +
                        " \n" +
                        "1 muỗng cafe mật ong.",
                "Bước 1: Bưởi bóc vỏ và tách múi ra để riêng. Lưu ý bạn loại bỏ hết phần vỏ trắng để nước ép bưởi không bị đắng nhé.\n" +
                        " \n" +
                        "Bước 2: Cho múi bưởi vào máy xay sinh tố hoặc máy ép trái cây. Xay nhuyễn bưởi.\n" +
                        " \n" +
                        "Bước 3: Lọc phần bã để có ly nước ép bưởi nguyên chất thơm ngon và dễ uống.\n" +
                        " \n" +
                        "Bước 4: Đổ nước ép bưởi ra ly, thêm 1 muỗng cafe mật ong vào, khuấy đều và thưởng thức.\n" +
                        " \n" +
                        "Giảm cân là một quá trình cần sự cố gắng và nỗ lực rất nhiều, do đó, bạn hãy siêng năng áp dụng thử công thức trên, uống nước ép bưởi vào đúng thời điểm để giải pháp giảm cân bằng nước ép bưởi phát huy hết tác dụng bạn nhé.\n" +
                        "   ",
                "nuoc_ep_buoi.jpg",
                10)
        );
        tmp.add(new foodForGV("Sinh tố bơ" ,
                "Các loại sinh tố trái cây không chỉ giúp bạn giải nhiệt trong mùa hè, mà còn cung cấp cho cơ thể một lượng lớn dưỡng chất cần thiết, cũng như giúp bạn có làn da khỏe mạnh.\n" +
                        "    Hôm nay, bọn mình sẽ hướng dẫn bạn cách làm 3 loại sinh tố trái cây bổ dưỡng để giúp bạn ngăn ngừa bệnh tật, tăng cường sức khoẻ cũng như một vóc dáng đẹp. Cùng bắt tay vào thực hiện với chúng tôi ngay thôi nào.\n" +
                        "    ",
                "Bơ 100gr\n" +
                        "         \n" +
                        "Đường cát 20gr\n" +
                        "         \n" +
                        "Sữa đặc 40ml\n" +
                        "         \n" +
                        "Sữa tươi 15 – 20ml\n" +
                        "         \n" +
                        "Đậu xanh xay nhuyễn 2 muỗng\n" +
                        "         \n" +
                        "Đá viên 1 ly",
                "Bước 1: Bơ mua về rửa sạch, tách vỏ, bỏ hạt, cắt thành miếng.\n" +
                        " \n" +
                        "Bước 2: Sau đó bạn chuẩn bị một cái máy xay, cho lần lượt các nguyên liệu (trừ đá) vào máy. Đậy kín nắp, ấn nút xay các hỗn hợp.\n" +
                        " \n" +
                        "Bước 3: Cho thêm 1 ly đá đầy vào máy tiếp tục xay cho đến khi nhuyễn và mềm mịn hoàn toàn.\n" +
                        " \n" +
                        "Bước 4: Rót ra ly và thưởng thức ngay thành quả của mình nhé các bạn.\n" +
                        "         \n" +
                        "Sau khi hoàn thành buổi học, bạn sẽ biết cách pha chế ly sinh tố thơm ngon đẹp mắt để chiêu đãi gia đình, bạn bè mỗi khi có dịp.\n" +
                        " \n" +
                        "Chúc bạn thành công khi thực hiện.",
                "sinh_to_bo.jpg", 11)
        );
        tmp.add(new foodForGV("Nước sen dừa" ,
                "Nước sen dừa hẳn là đã rất quen thuộc với nhiều gia đình, được biết đến không chỉ với công dụng giải khát mà còn giúp thanh lọc cơ thể, thư giãn tinh thần, bồi bổ cho sức khỏe.\n" +
                        "    Nếu trước giờ bạn chỉ quen với việc mua những loại thức uống này ngoài hàng quán thì hôm nay, hãy cùng vào bếp cùng bọn mình để học cách làm những loại thức uống này nhé. Vừa có thể chiêu đãi cho cả nhà những ly thức uống vừa mát lạnh lại vừa đảm bảo an toàn, tiết kiệm chi phí.\n" +
                        "    ",
                "Hạt sen khô 200gr hoặc hạt sen tươi 100gr\n" +
                        "         \n" +
                        "Dừa thái sợi 100gr\n" +
                        "         \n" +
                        "Đường phèn 400gr\n" +
                        "         \n" +
                        "Nước lọc 2 lít",
                "Bước 1: Ngâm hạt sen khô với nước lạnh khoảng 2 giờ cho nở, vớt ra chà, đãi sạch vỏ lụa bên ngoài. Nếu dùng sen tươi, bạn bỏ qua bước ngâm, chỉ cần rửa sạch, để ráo.\n" +
                        " \n" +
                        "Bước 2: Cho hạt sen vào nồi, thêm nước lọc (tỉ lệ 200gr hạt sen tươi + 2 lít nước, 100gr hạt sen tươi + 1 lít nước), đun với lửa nhỏ liu riu khoảng 1 giờ cho sen chín mềm, vớt sen ra để riêng. Bạn chú ý trong lúc nấu phải hớt bọt, cặn liên tục để nước sen được trong, không để hạt sen bị nát. Nước luộc sen lọc qua rây, lấy nước trong để nguội.\n" +
                        " \n" +
                        "Bước 3: Đường phèn cho vào nồi nước sen đã lọc sạch. Đổ thêm chút nước lạnh, đun sôi, để nguội.\n" +
                        " \n" +
                        "Bước 4: Khi thưởng thức bạn cho hạt sen đã luộc, dừa sợi vào ly, rót nước đường rồi thêm đá viên vào uống lạnh.\n" +
                        " \n" +
                        "Chúc bạn thành công khi thực hiện.",
                "nuoc_sen_dua.jpg",
                12));
        tmp.add(new foodForGV("Rau má đậu xanh" ,
                "Rau má đậu xanh hẳn là đã rất quen thuộc với nhiều gia đình, được biết đến không chỉ với công dụng giải khát mà còn giúp thanh lọc cơ thể, thư giãn tinh thần, bồi bổ cho sức khỏe.\n" +
                        "    Nếu trước giờ bạn chỉ quen với việc mua những loại thức uống này ngoài hàng quán thì hôm nay, hãy cùng vào bếp cùng bọn mình để học cách làm những loại thức uống này nhé. Vừa có thể chiêu đãi cho cả nhà những ly thức uống vừa mát lạnh lại vừa đảm bảo an toàn, tiết kiệm chi phí.\n" +
                        "    ",
                "Rau má 1 kg (700gr rau má lớn + 300gr rau má nhỏ)\n" +
                        "         \n" +
                        "Nước 800ml\n" +
                        "         \n" +
                        "Đậu xanh 200gr\n" +
                        "         \n" +
                        "Đường cát 200gr",
                "Bước 1: Đậu xanh vo sạch, ngâm nước ấm khoảng 3 – 4 phút cho đậu xanh nở mềm. Lúc đậu xanh đã nở, bạn đãi sạch vỏ. Tiếp theo bạn cho đậu xanh vào nồi hấp chín. Khi đậu xanh đã chín, bạn cho vào cối xay nhuyễn.\n" +
                        " \n" +
                        "Bước 2: Rau má bạn nhặt bỏ những lá sâu, úng rồi rửa sạch, để ráo nước, cắt nhỏ. Cho từ từ rau má vào máy xay sinh tố cùng 800 ml nước lọc xay nhuyễn, lọc qua rây để lấy nước cốt.\n" +
                        " \n" +
                        "Bước 3: Đậu xanh sau khi xay nhuyễn cho vào máy xay, thêm đường, nước rau má vừa lọc vào xay mịn lại lần nữa. Cho nước rau má đậu xanh ra ly, thêm đá viên vào rồi thưởng thức.\n" +
                        " \n" +
                        "Chúc bạn thành công khi thực hiện.",
                "rau_ma_dau_xanh.jpg",
                13));
        tmp.add(new foodForGV("Sữa Gạo Hàn Quốc",
                "Mời bạn nhanh tay lưu ngay cách làm sữa gạo ngon chuẩn Hàn Quốc mà Bếp Gia Đình – Hướng Nghiệp Á Âu giới thiệu dưới đây để có thể thực hiện khi có thời gian rảnh. Đây là công thức được chính các chuyên gia pha chế hàng đầu chia sẻ đến Bếp Gia Đình.\n" +
                        "Chúng tôi hy vọng rằng qua công thức này, bạn sẽ biết cách làm món thức uống dinh dưỡng cho cả gia đình nhé!",
               "•  Gạo lứt 200gr\n" +
                       " \n" +
                       " • Sữa tươi không đường 3 hộp nhỏ\n" +
                       " \n" +
                       " • Nước lọc 1.5 lít\n" +
                       " \n" +
                       " • Đường phèn 100gr",
                "Bước 1: Rang gạo lứt\n" +
                        " \n" +
                        " • Gạo lứt mua về bạn lọc sạch vỏ trấu và vo sạch. Nhưng lưu ý là không vo quá kỹ vì sẽ làm giảm bớt dinh dưỡng có trong gạo.\n" +
                        " \n" +
                        " • Để gạo thật ráo nước thì bạn đặt chảo lên bếp, làm nóng chảo rồi cho gạo vào rang trên lửa vừa, đảo đều tay cho đến khi gạo dậy mùi thơm, hạt gạo chuyển sang màu vàng thì bạn tắt bếp, cho gạo ra âu lớn.\n" +
                        " \n" +
                        "Bước 2: Nấu gạo lứt\n" +
                        " \n" +
                        " • Bạn cho trước 500ml nước lọc vào nồi, đặt lên bếp đun sôi rồi cho gạo lứt rang vào nấu chín mềm. Lưu ý là bạn nên nấu trên lửa nhỏ nhé.\n" +
                        " \n" +
                        " • Khi bạn thấy gạo lứt đã nấu chín, bạn cho vào máy xay sinh tố và xay nhuyễn mịn.\n" +
                        " \n" +
                        " • Kế đó, cho gạo lứt đã xay nhuyễn lọc qua rây, lớp bột bên dưới bạn dùng muỗng tán mạnh cho tinh bột trong gạo lứt ra hết.\n" +
                        " \n" +
                        " • Tiếp tục, bạn cho phần nước còn lại vào một cái nồi khác, cho thêm 3 hộp nhỏ sữa tươi không đường cùng đường phèn vào đun sôi.\n" +
                        " \n" +
                        "Bước 3: Nấu sữa gạo lứt\n" +
                        "        \n" +
                        " • Sau khi hỗn hợp nước, sữa tươi và đường phèn sôi, bạn cho phần nước gạo lứt xay nhuyễn vào nấu cùng khoảng 5 phút, lúc này, chỉnh lửa nhỏ để sữa không bị trào.\n" +
                        " \n" +
                        " • Hết 5 phút đồng hồ, bạn tắt bếp và cho sữa vào bình, thưởng thức nóng hay lạnh tùy sở thích của bạn. Để bảo quản sữa được lâu, bạn nên cho vào bình, đậy kín nắp và đặt trong ngăn mát tủ lạnh, sữa có thể sử dụng trong 3 – 4 ngày.\n" +
                        " \n" +
                        " • Khi thưởng thức món sữa gạo lứt, bạn sẽ cảm nhận được hương thơm đặc trưng của gạo lứt, vị ngọt béo của sữa hòa quyện sẽ khiến bạn cứ muống uống hoài. Với những ai đang giảm cân, khi nấu sữa gạo lứt, bạn không cho đường phèn và sử dụng sữa không đường đã tách béo để vừa đảm bảo dinh dưỡng vừa không bị tăng cân.\n" +
                        " ",
                "sua_gao_lut.jpg",
                14));
        tmp.add(new foodForGV("Trà Bí Đao" ,
                "Bạn đã bao giờ tự thử nấu nước trà bí đao thơm mát tại nhà để chiêu đãi những người thân yêu, giúp họ xua tan bớt cái nắng nóng, thanh nhiệt, giải độc cơ thể chưa? Nếu chưa tham khảo ngay cách làm trà bí đao độc quyền từ Bếp Gia Đình – Hướng Nghiệp Á Âu nhé!",
                " • 1kg bí đao\n" +
                        " \n" +
                        " • 2 khúc mía lau\n" +
                        " \n" +
                        " • 20gr đường phèn\n" +
                        " \n" +
                        " • 3 muỗng cà phê hạt chia\n" +
                        " \n" +
                        " • 1/3 muỗng cà phê muối\n" +
                        " \n" +
                        " • 10gr thục địa\n" +
                        " \n" +
                        " • 45gr lá dứa",
                "Bước 1: Sơ chế nguyên liệu\n" +
                        " \n" +
                        " • Bí đao rửa sạch, để nguyên vỏ rồi cắt thành những khoanh dày khoảng 1 – 2cm. Để nước bí đao đậm đà, thơm ngon hơn, bạn chọn những trái bí già, vỏ có những đốm vàng bên ngoài.\n" +
                        " \n" +
                        " • Nếu không chọn mua được bí đao già, bạn có thể dùng bí non nhưng trước khi nấu cần bỏ hạt để nước thành phẩm không bị chua.\n" +
                        " \n" +
                        "Bước 2: Nấu trà bí đao\n" +
                        " \n" +
                        " • Đầu tiên, bạn cho bí đao, thục địa, muối, mía lau, lá dứa vào nồi, thêm khoảng 2 – 3 lít nước. Kế đó, bạn đặt nồi lên bếp nấu và chỉnh lửa vừa. Trong quá trình nấu, bạn không đậy nắp nồi để nước bí thơm và trong hơn nhé\n" +
                        " \n" +
                        " • Lưu ý là chỉ cho vài miếng thục địa đủ để tạo màu nâu đen đẹp mắt cho trà và không cho quá nhiều, trà sẽ bị đắng nhé.\n" +
                        " \n" +
                        "Bước 3: Hoàn thành trà bí đao\n" +
                        " \n" +
                        " • Khi nồi nước nấu bí đao chuyển sang màu nâu nhạt, bí chín mềm thì bạn nhẹ nhàng vớt bí ra, thêm đường phèn vào nấu cho đến khi đường tan hết thì tắt bếp.\n" +
                        " \n" +
                        " • Lúc này, bạn đã có thể thưởng thức trà bí đao mát lạnh bằng cách cho vào một muỗng cà phê hạt chia, khuấy đều và để một lát cho hạt chia nở ra, để nguội thì cho vào ngăn mát tủ lạnh làm mát hoặc cho thêm đá vào uống ngay.\n" +
                        " \n" +
                        " • Trà bí đao hạt chia thành phẩm có màu nâu nhạt, tác dụng giải nhiệt rất tốt. Nếu bạn kết hợp thêm hạt chia sẽ giúp gia tăng giá trị dinh dưỡng của thức uống. Với những ai muốn giảm cân, trà bí đao hạt chia là lựa chọn phù hợp, tuy nhiên bạn nhớ giảm lượng đường để hạn chế năng lượng nạp vào cơ thể nhé!\n" +
                        " ",
                "tra_bi_dao_hat_chia.jpg",
                15));
        tmp.add(new foodForGV("Trà sữa thạch" ,
                "Trà sữa thạch tự làm được chế biến từ những nguyên liệu có thể dễ dàng tìm mua tại các siêu thị, chợ, cửa hàng tiện lợi… Tin chắc rằng, với công thức dưới đây của daubepgiadinh.vn sẽ giúp bạn nhanh chóng pha chế được những ly trà sữa ngon lành để chiêu đãi cả nhà.",
                "Thạch rau câu 100 gram\n" +
                        " \n" +
                        "đường cát trắng 10 gram\n" +
                        " \n" +
                        "bột rau câu dẻo\n" +
                        " \n" +
                        "600 ml nước\n" +
                        " \n" +
                        "10 ml syrup Blue ( hoặc cà phê, syrup dâu, đào…)\n" +
                        " \n" +
                        "Trà sữa\n" +
                        " \n" +
                        "100 gram trà Hoa Trân số 9\n" +
                        " \n" +
                        "1 lí nước\n" +
                        " \n" +
                        "350 gram đường cát trắng\n" +
                        " \n" +
                        "400 gram sữa bột Indo\n" +
                        " \n" +
                        "Đá viên\n",
                "Thạch rau câu\n" +
                        " \n" +
                        "Bước 1: Trộn 100 gram đường cát trắng và 10 gram bột rau câu dẻo vào tô thủy tinh.\n" +
                        " \n" +
                        "Bước 2: Chuẩn bị một cái nồi, đổ 600 ml nước vào bắc lên bếp đun sôi, sau đó cho thêm hỗn hợp bột rau câu và đường vào. Khuấy đều cho tan.\n" +
                        " \n" +
                        "Bước 3: Cho 10 ml syrup Blue vào tô thủy tinh, rót hỗn hợp nước đã đun sôi vào. Để tủ mát trong 30 phút cho phần thạch này đông lại. Sau đó bạn cắt các phần thạch này ra thành những miếng nhỏ vừa ăn.\n" +
                        " \n" +
                        "Trà sữa\n" +
                        " \n" +
                        "Bước 1: Cho 100 gram trà Hoa Trân số 9 ủ với 1 lít nước nóng khoảng 30 phút, lọc qua rây lấy nước trà.\n" +
                        " \n" +
                        "Bước 2: Cho lần lượt tất cả các nguyên liệu đường, sữa bột và nước trà đã lọc vào âu trộn inox, sau đó khuấy đều hỗn hợp. Lược lại thêm lần nữa cho mịn hoàn toàn.\n" +
                        " \n" +
                        "Bước 3: Rót 100 ml trà sữa và đá viên vào bình lắc shaker sau đó lắc đều.\n" +
                        " \n" +
                        "Bước 4: Đổ trà sữa ra ly, thêm thạch và thưởng thức ngay.",
                "tra_sua_thach.jpg",
                16));
        return tmp;
    }

    public  ArrayList<foodForGV> initFoodForGV3_Ultis()
    {
        ArrayList<foodForGV> tmp = new ArrayList<>();
        tmp.add(new foodForGV("Giò thủ lá chuối",
                "Giò thủ là món ăn thơm ngon không thể thiếu trong ngày Tết, cách làm giò thủ khá đơn giản nhưng nhiều chị em lại gặp khó khăn trong khâu gói giò bởi không có khuôn. Nếu không mua được khuôn, bàn hoàn toàn có thể học cách gói giò thủ bằng lá chuối vừa đơn giản, sẵn lá chuối tại vườn mà món giò thủ cũng rất chắc tay, thơm ngon và giữ được lâu với hướng dẫn đưới dây.",
                "Lưỡi heo: 600g\n" +
                        "         \n" +
                        "Tai heo: 600g\n" +
                        "        \n" +
                        "Thịt phần chân giò đã rút xương: 200gr\n" +
                        "         \n" +
                        "Nấm Mèo: 80gr\n" +
                        "         \n" +
                        "Nấm Hương: 80gr\n" +
                        "         \n" +
                        "Hành tím: 5 củ\n" +
                        "         \n" +
                        "Gia vị: Muối, nước mắm, đường, bột ngọt, tiêu, ớt\n" +
                        "         \n" +
                        "Lá chuối và dây lạt hoặc dây nilon\n",
                "Bước 1: Sơ chế nguyên liệu khô\n" +
                        " \n" +
                        "Đem lá chuối rửa sạch, phơi hơi khô\n" +
                        "         \n" +
                        "Hành tím bóc bỏ vỏ, đập dập và cắt nhỏ.\n" +
                        "         \n" +
                        "Ngâm nấm mèo trong nước nóng khoảng 10 phút cho nở hoàn toàn, vớt ra đem cắt bỏ chân, rửa sạch sau đó đem xắt thành sợi nhỏ.\n" +
                        "         \n" +
                        "Ngâm nấm hương trong nước nóng khoảng 3 phút, bạn cắt bỏ phần chân bị đen rồi rửa sạch và cũng đem cắt nhỏ.\n" +
                        "         \n" +
                        "Bước 2: Sơ chế nguyên liệu tươi\n" +
                        " \n" +
                        "Lưỡi heo, tai heo và thịt chân giò bạn đem rửa sạch với nước muối pha loãng. Cho tất cả vào nồi luộc sơ qua. Khi luộc bạn cho thêm muỗng muối và muỗng giấm vào để thịt được sạch.\n" +
                        "         \n" +
                        "Thịt luộc xong bạn vớt ra ngâm với nước lạnh để thịt không bị thâm.\n" +
                        "         \n" +
                        "Cắt thịt thành từng miếng nhỏ vừa ăn, sau đó đem ướp với nước mắm, hạt nêm, đường, hành tím băm nhỏ, tiêu, ớt và để thịt thấm gia vị trong khoảng 30 phút.\n" +
                        " \n" +
                        "Bước 3: Xào thịt giò thủ\n" +
                        "\n" +
                        "Bắc chảo lên bếp, chờ chảo nóng thì bạn cho 1 muỗng dầu ăn vào tráng đều mặt chảo. Dầu sôi, bạn cho thêm hành tím băm nhỏ vào phi thơm.\n" +
                        "         \n" +
                        "Tiếp tục cho tất cả thịt đã cắt và ướp vào xào đều tay. Bạn có thể nêm nếm lại gia vị sao cho vừa vặn với khẩu vị của gia đình bạn.\n" +
                        "         \n" +
                        "Xào cho tới khi thịt săn lại thì cho thêm nấm mèo và nấm hương đã thái vào. Xào tiếp đến khi thịt heo ra mỡ và nấm đã thấm gia vị thì tắt bếp.\n" +
                        "         \n" +
                        "Bước 4: Gói giò thủ bằng lá chuối\n" +
                        " \n" +
                        "Trải lá chuối ra, đổ hết thịt và nấm đã xào lên lá chuối. Gói lá chuối lại rồi dùng dây lạt hoặc dây nilon để cột chặt giò thủ và định hình cho cây giò thẳng, không bị méo.\n" +
                        " \n" +
                        "Bạn lưu ý là nên gói giò khi giò còn nóng, nếu để nguội giò sẽ không dính chặt. Gói lá chuối thật chặt tay để thành phẩm sau khi hoàn thành tròn đều, đẹp mắt.\n" +
                        " ",
                "gio_thu_la_chuoii.jpg",
                17));
        tmp.add(new foodForGV("Xôi gà xé" ,
                "Cắn một miếng xôi dẻo, ngọt thơm cùng với miếng thịt gà béo béo, mằn mặn ngon miệng lại cung cấp đầy đủ năng lượng cho bữa sáng. Hãy cùng tham khảo công thức nấu xôi gà xé hấp dẫn sau đây vào bữa sáng thơm ngon, an toàn cho gia đình bạn nhé.",
                "300g gạo nếp (ngâm khoảng 6 – 8 tiếng, đừng ngâm quá 8 tiếng vì nếp dễ bị chua nhé)\n" +
                        "         \n" +
                        "2 đùi gà\n" +
                        "         \n" +
                        "Hành lá\n" +
                        "         \n" +
                        "Gia vị: dầu ăn, muối, đường, nước tương, tiêu, tỏi, hành khô băm nhỏ",
                "Bước 1: Đùi gà rửa sạch, để ráo nước, dùng nĩa hoặc tăm xâm mặt cho gà dễ ngấm gia vị. Cho một muỗng cà phê muối, 1 muỗng cà phê đường, 1 muỗng nước tương, 1 muỗng tỏi, 1 muỗng hành băm nhuyễn vào trộn đều. Để gà khoảng 30 phút để ngấm gia vị.\n" +
                        " \n" +
                        "Bước 2: Trong lúc đợi gà thấm gia vị, bạn luộc chín lạc sau đó vớt ra xả với nước lạnh, để ráo sau đó cho vào 1 thìa muối nhỏ, trộn đều. Gạo nếp sau khi ngâm vo sạch, để ráo. Bạn nên ngâm nếp trước khi nấu để nếp ngậm đủ nước sẽ dễ chín mềm, ngon hơn nhé.\n" +
                        " \n" +
                        "Bước 3: Cho lạc và nếp vào nồi, đổ nước xâm xấp mặt nếp là có thể nấu được. Khi thấy nồi cơm điện chuyển sang nút giữ ấm (warm) thì dùng đũa xới đều. Sau đó đậy kín nắp thêm khoảng 10 phút để xôi đậu được chín dẻo. Sau khi thấy xôi đã chín, bạn mở nắp để tránh cho nước nhỏ giọt lại làm xôi bị nhũn.\n" +
                        " \n" +
                        "Bước 4: Lúc này bạn chuẩn bị 1 cái chảo nóng già, cho đùi gà vào chiên trong lửa nhỏ để thịt gà chín đều. Sau khi gà chín vàng đều, đợi gà nguội thì xé sợi nhỏ vừa ăn.\n" +
                        " \n" +
                        "Bước 5: Cho vào hành lá xắt nhỏ ½ muỗng cà phê muối, ½ muỗng cà phê đường trọn đều rồi dùng dầu nóng già (có thể tận dụng dầu chiên gà) rưới lên hành để làm mỡ hành giúp món xôi gà xé thêm thơm và béo. Bạn có thể làm hành phi thay vì mỡ hành cũng rất thơm và ngon nhé.\n" +
                        " \n" +
                        "Bước 6: Cho xôi ra đĩa, cho gà xé lên mặt xôi, rưới thêm mỡ hành lên là có ngay 1 đĩa xôi gà xé thơm phưng phức.",
                "xoi_ga_xe.jpg",
                18));
        tmp.add(new foodForGV("Thịt heo kho" ,
                "Thịt kho là món ăn quen thuộc trong bữa cơm của các gia đình Việt, món thịt kho đậm đà hương vị, độ mặn, ngọt vừa phải ăn với cơm nóng rất đưa cơm. Cách làm thịt kho có thể được biến tấu thành nhiều cách khác nhau, mỗi vùng miền lại có cách sử dụng nguyên liệu và gia vị riêng để giúp hương vị của món thịt kho đa dạng, hấp dẫn hơn. Trong bài viết này, chúng tôi sẽ hướng dẫn cho bạn từ A – Z bí quyết kho thịt heo ngon nhất. Áp dụng công thức này, bạn có thể thay đổi nguyên liệu để nấu các món kho khác như thịt kho tiêu, thịt kho tàu, thịt kho trứng cút,….Cùng theo dõi và thực hiện nhé!",
                "Thịt ba chỉ: 400gr\n" +
                        "\n" +
                        "Nước dừa: 500gr\n" +
                        "\n" +
                        "Trứng cút: 10 quả\n" +
                        "\n" +
                        "Hành khô: 2 củ\n" +
                        "\n" +
                        "Nước mắm, hạt tiêu, đường, ớt",
                "Bước 1: Sơ chế nguyên liệu để làm món thịt kho\n" +
                        " \n" +
                        "Hành khô băm nhỏ. ½ đem ướp thịt. ½ để phi.\n" +
                        " \n" +
                        "Thái thịt thành từng miếng nhỏ vừa ăn, đem ướp thịt với chút nước mắm, hành khô băm, tiêu, hành, ớt khoảng 15 phút cho thấm gia vị.\n" +
                        " \n" +
                        "Trứng cút đem luộc chín và bóc vỏ. Bạn có thể thay thế trứng cút bằng trứng vịt hoặc trứng gà đều được.\n" +
                        " \n" +
                        "Bước 2: Kho thịt\n" +
                        " \n" +
                        "Bắc chảo lên bếp, cho một ít dầu ăn vào, dầu nóng thì cho thêm 2 – 3 muỗng đường vào, vừa đun vừa khuấy đều cho đến khi đường chảy, chuyển sang màu vàng cánh gián.\n" +
                        " \n" +
                        "Tiếp tục cho hành khô băm vào phi thơm rồi cho thịt đã ướp vào đảo đều, đảo đến khi thịt ngấm nước hàng và săn lại thì đổ tiếp nước dừa vào nồi thịt kho.\n" +
                        " \n" +
                        "Kho thịt với lửa nhỏ trong khoảng 25 – 30 phút. Khi thịt mềm thì cho tiếp trứng cút đã luộc vào kho cùng. Kho đến khi nước trong nồi thịt gần cạn, thịt chín mềm, có màu đẹp mắt thì bạn nêm nếm lại các gia vị sao cho vừa khẩu vị gia đình mình nữa là tắt bếp.\n" +
                        " \n" +
                        "Bước 3: Lưu ý\n" +
                        " \n" +
                        "Khâu chọn thịt ngon:\n" +
                        " \n" +
                        "Để có nồi thịt heo kho ngon, bạn phải chọn loại thịt ba chỉ tươi, ngon, không có mùi hôi. Miếng ba chỉ có lớp mỡ dày giúp miếng thịt khi kho óng ả đẹp mắt. Không nên chỉ chọn thịt nạc thôi khi khi kho thịt sẽ bị khô và không có vị béo ngậy.\n" +
                        " \n" +
                        "Khâu bẩm ướp gia vị:\n" +
                        " \n" +
                        "Thịt sau khi rửa sạch, bạn đem thái miếng rồi tẩm ướp gia vị. Việc tẩm ướp gia vị ở đây có thể đơn giản hoặc cầu kỳ theo sở thích của bạn. Ngoài các gia vị như muối, đường, nước mắm, bạn cũng có thể cho thêm tỏi, sả, gừng, mắm nêm, bột canh, ngũ vị hương…\n" +
                        " \n" +
                        "Nên ướp thịt ít nhất từ 15 – 20 phút để thịt ngấm được gia vị cho đều trước khi nấu. Có thể ướp qua đêm, bọc kín và bảo quản trong tủ lạnh. Tuy nhiên nếu ướp trong tủ lạnh bạn không nên ướp với hành, đường và tỏi.\n" +
                        " \n" +
                        "Xay nhuyễn hành, tỏi và bóp lấy nước trộn với thịt rồi sau đó mới cho phần xác trộn sau cùng sẽ giúp thịt đẫm gia vị hơn.\n" +
                        " \n" +
                        "Làm nước màu kho thịt:\n" +
                        " \n" +
                        "Bạn có thể mua gói gia vị nước hàng sẵn ngoài chợ để kho thịt heo ngon hoặc tự chế biến bằng đường theo hướng dẫn trên.\n" +
                        "        \n" +
                        "Khi đường trong nước sủi lên chuyển vàng đậm hoặc để già hơn một chút khi có ánh đỏ là thời điểm phù hợp cho thịt vào đảo, nếu phi đường quá già sẽ có vị đắng.\n" +
                        "        \n" +
                        "Nếu thịt bị nhạt màu bạn có thể chữa bằng cách bật lửa to đun cho cạn nước, nước cạn sẽ sánh lại dần thì màu cũng sẽ lên dần. Ngoài ra bạn cũng có thể chữa bằng cách múc riêng thịt ra rồi đun nước kho thịt tới sánh rồi mới cho thịt vào nồi đảo tiếp.\n" +
                        " \n" +
                        "Bí quyết kho thịt\n" +
                        " \n" +
                        "Thịt sau khi đã tẩm ướp đem cho vào nồi đảo đều đến lúc thịt săn lại thì cho nước hàng vào đun cho thịt sôi rồi vặn nhỏ lửa, tiếp tục đun liu riu cho đến khi thịt chín mềm và nước sốt sánh lại là được. Nếu bạn kho nhiều thịt cùng một lúc thì nên chia ra làm nhiều nồi, không nên để quá nhiều thịt một lúc.\n" +
                        "  ",
                "thit_heo_kho.jpg",19));
        tmp.add(new foodForGV("Cháo Yến Mạch<" ,
                "Cháo yến mạch rau củ là một trong những món cháo thơm ngon, bổ dưỡng thích hợp cho bé đang trong thời kỳ ăn dặm. Cách nấu cháo yến mạch rau củ cũng đơn giản lại nhanh chóng nên các mẹ có thể tiết kiệm được thời gian, chăm sóc cho bé yêu nhà mình tốt hơn. Hãy cùng Đầu Bếp Gia Đình tham khảo công thức dưới đây ngay nhé.",
                "50gr yến mạch\n" +
                        " \n" +
                        "3 con tôm\n" +
                        " \n" +
                        "20gr đậu Hà Lan\n" +
                        " \n" +
                        "1/2 củ cà rốt\n" +
                        "        \n" +
                        "20gr súp lơ\n" +
                        " \n" +
                        "20gr củ cải đỏ\n" +
                        " \n" +
                        "1/2 muỗng cà phê dầu olive\n" +
                        " \n" +
                        "Mách nhỏ: Để món cháo yến mạch rau củ của bạn thơm ngon, dinh dưỡng đầy đủ và không mất nhiều thời gian chế biến thì bạn nên sử dụng loại yến mạch cán dẹt. Yến mạch cán là loại yến mạch được cắt nhỏ, hấp chín và cán dẹt. Yến mạch cán mỏng sẽ nhanh chín hơn. Và bạn cũng lưu ý khi nấu cháo thì tỷ lệ yến mạch và nước là 1:2.\n" +
                        "   ",
                "Bước 1: Sơ chế nguyên liệu\n" +
                        " \n" +
                        " • Yến mạch mua về, bạn cho ra bát một phần vừa đủ, sau đó, trút vào nồi và ngâm với nước cho yến mạch mềm.\n" +
                        " \n" +
                        " • Cà rốt, bạn bào vỏ, rửa sạch rồi cắt hạt lưu.\n" +
                        " \n" +
                        " • Tương tự, củ cải đỏ bạn cũng bào vỏ, rửa sạch rồi cắt thành hạt lưu nhỏ cho nhanh chín.\n" +
                        " \n" +
                        " • Bông súp lơ bạn tách thành từng nhánh nhỏ, rửa dưới vòi nước cho sạch rồi để ráo.\n" +
                        " \n" +
                        " • Đậu Hà Lan bạn chỉ cần rửa sạch là được.\n" +
                        " \n" +
                        " • Tôm bóc vỏ, bỏ chỉ đen rồi băm nhỏ, ướp với xíu muối.\n" +
                        " \n" +
                        "Bước 2: Nấu cháo yến mạch rau củ\n" +
                        " \n" +
                        " • Cho tất cả các loại rau củ này vào nồi và nấu chín mềm, sau đó, bạn cho tôm vào nấu chín. Cuối cùng, bạn trút yến mạch đã ngâm mềm vào nấu cùng.\n" +
                        " \n" +
                        " • Vừa nấu bạn vừa khuấy cho đến khi tất cả các nguyên liệu chín nhuyễn thì thêm vào một xíu muối cho dễ ăn. Lưu ý là trong quá trình nấu, bạn nên chỉnh lửa nhỏ và thường dùng đũa khuấy đều để cháo không bị dính đáy nồi.\n" +
                        " \n" +
                        " • Sau khi tất cả các nguyên liệu đã mềm nhuyễn rồi thì bạn múc cháo ra tô, cho vào ½ muỗng cà phê dầu olive. Nếu có máy xay, bạn cho cháo vào xay nhuyễn. Nếu không có máy xay, bạn có thể dùng tán nhuyễn qua rây.\n" +
                        " \n" +
                        "Bước 3: Cho bé thưởng thức\n" +
                        " \n" +
                        " • Cháo sau khi tán nhuyễn, cho bạn ra tô, để nguội vừa phải thì cho bé thưởng thức. Với các bé đang trong chế độ ăn dặm, 1 tuần bạn có thể nấu món cháo yến mạch 3 lần. Các bữa còn lại, bạn có thể thay thế bằng các món cháo khác như cháo lươn, cháo cá, cháo tôm, cháo thịt bò rau củ… để bé có thể bổ sung dinh dưỡng một cách đầy đủ nhất nhé.\n" +
                        " \n" +
                        "Hy vọng cách nấu cháo yến mạch rau củ cho bé yêu mà chúng tôi vừa chia sẻ sẽ giúp bạn làm mới thực đơn các món ăn dặm cho bé, giúp bé máu ăn chóng lớn và phát triển toàn diện. Ngoài ra, nếu bạn có công thức chế biến món ăn cho bé mới lạ thì đừng ngần ngại mà chia sẻ ngay để chúng tôi có thể giới thiệu để nhiều bạn đọc hơn.\n" +
                        " ",
                "chao_ye_mach_dinh_duong.jpg",20));
        tmp.add(new foodForGV("Cánh gà chiên nước mắm" ,
                "Thịt gà là loại thức ăn quen thuộc của mọi gia đình, có nhiều món ăn ngon được chế biến từ gà như gà luộc, gà hấp, gà nướng…và cánh gà chiên nước mắm cũng nằm trong danh sách các món ngon của các chị em nội trợ đảm đang.",
                "Cánh gà 500 gram\n" +
                        "         \n" +
                        "Đường 2 muỗng canh\n" +
                        "    \n" +
                        "Nước mắm ngon 2 muỗng canh\n" +
                        "   \n" +
                        "Ớt băm 1/2 muỗng cà phê\n" +
                        "   \n" +
                        "Bột gia vị 1 muỗng cà phê\n" +
                        "   \n" +
                        "Muối 1 muỗng canh\n" +
                        "     \n" +
                        "Tiêu xay 1/2 muỗng cà phê\n" +
                        "   \n" +
                        "Hành tím băm nhỏ 1 nhỏ (băm nhỏ, vắt lấy nước cốt)\n" +
                        "   \n" +
                        "Tỏi khô 1 củ (băm nhỏ)\n" +
                        "   \n" +
                        "Khi mua cánh gà, bạn nên chọn loại cánh vừa, cánh gà nhỏ sẽ ít thịt và ngon hơn. Cánh gà quá to sẽ bị mềm và bở.",
                "Bước 1: Cánh gà chặt làm 3 khúc, chà muối lên gà để làm sạch, rửa lại với nước rồi cho vào rổ để ráo nước. Tiếp theo bạn cho cánh gà vào tô, ướp cánh gà với gia vị, nước cốt hành khô, hạt tiêu để khoảng 20 phút cho thấm gia vị.\n" +
                        " \n" +
                        "Bước 2: Cho cánh gà vào lò vi sóng, quay khoảng 5 – 7 phút để cánh gà chín sơ. (Cách làm sẽ làm cho cánh gà được chín từ bên trong, bạn phải lo cánh gà bị sống và nước trong cánh gà tiết ra hết, cánh không bị mềm bở và tiết kiệm thời gian chiên gà)\n" +
                        " \n" +
                        "Bước 3: Lấy cánh ga ra, cho cánh gà vào chảo ngập dầu, để lửa lớn để cánh gà vàng đều hai mặt, da giòn.\n" +
                        " \n" +
                        "Bước 4: Hòa tan đường, nước mắm ngon, 1 muỗng nước lọc, ớt băm vào chén. Cho một muỗng dầu ăn vào chảo, phi thơm tỏi băm, cho chén nước mắm vào đun sôi. Trút phần cánh gà đã chiên vàng vào, đảo nhanh tay trên lửa lớn, xóc vài lần để cánh gà ngấm nước mắm.\n" +
                        " \n" +
                        "Bước 5: Trình bày cánh gà chiên mắm ra đĩa, dùng nóng với dưa leo hoặc salad đều ngon.\n" +
                        " \n" +
                        "Chúc bạn thành công với cách làm cánh gà chiên nước mắm này nhé.",
                "canh_ga_chien_nuoc_mam.jpg",21));
        tmp.add(new foodForGV("Thịt dê hấp lá tía tô" ,
                "Thịt dê thơm ngon, ít cholesterol lại giúp hỗ trợ nhiều vấn đề sức khỏe. Hấp là một trong những cách giữ được vị tươi ngon của thịt dê, bảo toàn được các chất dinh dưỡng, lại nhanh gọn phù hợp với những gia đình bận rộn.\n" +
                        " \n" +
                        "        Có nhiều cách chế biến thịt dê, tuy nhiên hấp lá tía tô là một trong những cách giúp giữ được vị tươi ngọt của thịt. Cách làm thịt dê hấp lá tía tô rất dễ, chỉ cần khoảng 30 phút để chuẩn bị và hoàn thành món ăn thơm ngon cho cả nhà. Hãy cùng Daubepgiadinh.vn tham khảo cách làm món hấp đơn giản được chia sẻ dưới đây nhé.\n" +
                        "    ",
                "Làm món dê hấp\n" +
                        " \n" +
                        " • 500gr thịt dê tươi\n" +
                        " \n" +
                        " • 100gr tía tô\n" +
                        " \n" +
                        " • 5 nhánh sả\n" +
                        " \n" +
                        " • 1 trái ớt sừng\n" +
                        " \n" +
                        " • ½ muỗng sa tế\n" +
                        " \n" +
                        " • 1 nhánh gừng nhỏ\n" +
                        " \n" +
                        " • Gia vị: bột ngọt, muối, tiêu xay, đường.\n" +
                        " \n" +
                        "Làm nước chấm\n" +
                        " \n" +
                        " • 1 – 2 thìa chao\n" +
                        " \n" +
                        " • 1 muỗng đường\n" +
                        " \n" +
                        " • ¼ muỗng bột canh\n" +
                        " \n" +
                        " • ½ muỗng sa tế ớt",
                "Bước 1: Sơ chế nguyên liệu\n" +
                        " \n" +
                        " • Thịt dê mua về rửa sạch, thái lát mỏng vừa ăn. Cho vào bát ướp với 1/6 muỗng bột ngọt, ¼ muỗng muối, ¼ muỗng tiêu, ¼ muỗng đường khoảng 30 phút cho thấp vị.\n" +
                        " \n" +
                        " • Các nguyên liệu còn lại rửa sạch. Bạn lấy 1 phần sả tách phần lá già bỏ, bào mỏng, 1 phần cắt khúc, đập dập. Tía tô rửa sạch, nhặt lấy lá. Gừng bào vỏ, cắt sợi.\n" +
                        " \n" +
                        "Bước 2: Chuẩn bị hấp\n" +
                        " \n" +
                        " • Bạn chuẩn bị 1 cái nồi, lót sả khúc đập dập vào, tiếp đó là tía tô, rải đều gừng vào rồi xếp thịt dê lên trên. Cho thêm ớt sừng thái lát vào để đẹp mắt hơn nhé. Với những thành phần này sẽ giúp khử được mùi tanh cả thịt dê.\n" +
                        " \n" +
                        "Bước 3: Hấp thịt dê\n" +
                        " \n" +
                        "  • Đem dê đi hấp cách thủy khoảng 1 tiếng là được. Sau khi cho thịt dê hấp ra đĩa, bạn có thể phi tỏi rưới lên trên mặt để món ăn được thơm ngon hơn.\n" +
                        " \n" +
                        " • Món thịt dê sau khi hấp xong mềm, thịt có vị ngọt, khi ăn cuốn lá tía tô chấm vào chén chao là hết sẩy. Để rút ngắn thời gian hấp dê bạn có thể dùng nồi hấp áp suất mà vẫn đảm bảo thịt dê chín mềm, thơm ngon.\n" +
                        "    ",
                "thit_de_thom.jpg",22));
        tmp.add(new foodForGV("Gỏi đu đủ" ,
                "Để chuẩn bị một bữa tiệc ngon ngoài việc bạn phải nấu nướng sao cho khéo thì còn phải biết cách lên thực đơn chuẩn xác, sao cho các món ăn từ khai vị, món chính, tráng miệng đều phải phù hợp với khách mời. Nhận thấy các khó khăn của các nàng dâu mới trong việc lên thực đơn cũng như chuẩn bị món ăn, Đầu Bếp Gia Đình xin mách các bạn các món gỏi khai vị từ đu đủ với 3 cách làm đơn giản giúp bạn ghi điểm tuyệt đối trước nhà chồng nhé!",
                "Đu đủ xanh ½ trái (khoảng 400gr)\n" +
                        " \n" +
                        "Cà rốt 1 trái\n" +
                        " \n" +
                        "Tôm 200gr\n" +
                        " \n" +
                        "Thịt ba chỉ 200gr\n" +
                        " \n" +
                        "Ớt 3 – 4 trái\n" +
                        " \n" +
                        "Tỏi băm nhuyễn 2 – 3 củ\n" +
                        " \n" +
                        "Hành tím bào mỏng 2 củ\n" +
                        " \n" +
                        "Chanh 1 trái\n" +
                        " \n" +
                        "Rau ăn kèm: rau răm, húng quế\n" +
                        " \n" +
                        "Đậu phộng rang giã nát 1 muỗng cà phê\n" +
                        " \n" +
                        "Gia vị nêm nếm: đường, nước mắm, bột ngọt.\n" +
                        "  ",
                "Bước 1: Sơ chế nguyên liệu\n" +
                        " \n" +
                        "Đu đủ rửa sạch, bỏ vỏ và bào thành từng sợi mỏng. Tiếp đó, bạn chuẩn bị 1 âu nước cốt chanh loãng kèm một ít đá ngâm sợi đu đủ trong 10 – 15 phút và vớt ra vắt ráo nước. Làm như vậy sẽ giúp đu đủ mất mủ, giòn mà không bị thâm đen.\n" +
                        " \n" +
                        "Cà rốt rửa sạch, bỏ vỏ và bào thành từng sơi mỏng. Sau đó, ngâm sợi cà rốt và nước giấm loãng pha đường trong khoảng 5 – 10 phút thì vớt ra vắt ráo.\n" +
                        " \n" +
                        "Tôm rửa sạch với nước muối, tách lấy chỉ đen trên thân tôm và bóc bỏ vỏ chỉ chừa phần đuôi sau đó luộc chín tôm.\n" +
                        " \n" +
                        "Chuẩn bị chảo dầu nóng, phi hành tím trong khoảng 30 giây để hành chín vàng giòn thì vớt ra để ráo dầu.\n" +
                        " \n" +
                        "Thịt ba chỉ rửa sạch, luộc chín sau đó cắt lát mỏng vừa ăn.\n" +
                        " \n" +
                        "Rau ăn kèm rửa sạch, để ráo rồi cắt nhỏ.\n" +
                        " \n" +
                        "Bước 2: Cách làm nước sốt trộn ngon\n" +
                        " \n" +
                        "Một bí quyết giúp các món gỏi luôn ngon mà hầu như ít nàng dâu mới nào để ý chính là phần nước sốt trộn. Và để sở hữu một hỗn hợp nước sốt ngon các bạn nên lưu ý một số vấn đề sau nhé:\n" +
                        " \n" +
                        "Độ mặn: khi làm nước sốt cho món gỏi bạn nên dựa trên số lượng để quyết định xem nên làm nước mắm nhiều hay ít. Và với các bạn lần đầu về nhà chồng cũng nên lưu ý về khẩu vị ăn của gia đình, vì mỗi vùng miền sẽ có cách ăn khác nhau.\n" +
                        " \n" +
                        "Độ cay: khi thêm ớt vào hỗn hợp nước sốt bạn nên lưu ý sao cho phù hợp với khẩu vị của từng lứa tuổi.\n" +
                        " \n" +
                        "Nước chấm đi kèm: đôi khi chúng ta nêm nếm sẽ không phù hợp với nhiều thành viên khác trong gia đình, vậy bạn nên chuẩn bị thêm một chén nước chấm riêng để “chữa cháy” cho tình huống này.\n" +
                        " \n" +
                        "Và để làm hỗn hợp trộn gỏi đu đủ tại nhà, bạn hãy hòa nước mắm và tỏi băm vào trước tương tự như cách làm nước mắm của gỏi bưởi, sau đó nêm thêm đường, nước cốt chanh sao cho đậm vị thì bạn thêm ớt băm sao vừa với khẩu vị của mọi người trong gia đình.\n" +
                        " \n" +
                        "Bước 3: Trộn gỏi và trang trí\n" +
                        " \n" +
                        "Và để hoàn thành món gỏi đu đủ tôm thịt tại nhà, bạn chỉ cần trộn đu đủ, cà rốt, tôm, thịt cùng nước sốt vừa làm ở trên và bóp thật đều cho gia vị thấm vào nguyên liệu. Sau đó, bạn dọn món gỏi ra đĩa, thêm một chút đậu phộng rang, rau răm và hung lủi lên phía trên để trang trí.\n" +
                        "  ",
                "goi_du_du.jpg",23));
        tmp.add(new foodForGV("Gỏi ngó sen tôm thịt" ,
                "Gỏi ngó sen tôm thịt được làm từ ngó sen giòn giòn trộn cùng tôm thịt luộc, hòa quyện với hương vị chua ngọt của nước mắm pha sẽ giúp bạn thanh nhiệt và cân bằng lại khẩu vị trong những hè nắng nóng.",
                "Ngó sen 500gr\n" +
                        " \n" +
                        "Thịt ba chỉ 150gr\n" +
                        " \n" +
                        "Tôm sú 200gr\n" +
                        " \n" +
                        "Cà rốt 200gr\n" +
                        " \n" +
                        "Cần tàu 100gr\n" +
                        " \n" +
                        "Hành tây 200gr\n" +
                        " \n" +
                        "Ngò rí 50gr\n" +
                        " \n" +
                        "Chanh 250gr\n" +
                        " \n" +
                        "Ớt 200gr\n" +
                        " \n" +
                        "Tỏi 100gr\n" +
                        " \n" +
                        "Đậu phộng 100gr\n" +
                        " \n" +
                        "Bánh phồng tôm 1 bịch\n" +
                        " \n" +
                        "Gia vị: Nước mắm ngon, đường, muối, giấm gạo, tương ớt.",
                "Bước 1: Làm nước mắm trộn gỏi với tỷ lệ nhưu sau: 1 chén nhỏ nước mắm ngon: 1 chén nhỏ đường : 1/2 muỗng cà phê bột ngọt: 1 muỗng cà phê muối. Cho tất cả vào tô, khuấy tan đường hoàn toàn rồi bắc lên bếp nấu đến khi nước mắm sệt lại. Đổ nước mắm trộn gỏi vừa nấu vào thố, thêm 1/2 chén tương ớt, 1/2 chén nước cốt chanh vào khuấy đều lên cho hỗn hợp hòa quyện rồi đổ ra chén.\n" +
                        " \n" +
                        "Bước 2: Cho ngó sen, tôm, , thịt ba chỉ, cà rốt, cần tàu, hành tây, rau răm vào thố, rưới 2/3 nước mắm trộn gỏi vào, trộn đều tất cả lên cho thấm với nước mắm trộn gỏi.\n" +
                        " \n" +
                        "Bước 3: Dọn gỏi ra dĩa, rắc đậu phộng rang, hành phi, ngò rí lên trang trí. Ớt tỉa hoa 2 trái trang trí thêm cho đẹp, còn lại băm nhuyễn. Tỏi cũng băm nhuyễn.\n" +
                        " \n" +
                        "Bước 4: Pha nước chấm: Pha 1/3 nước mắm trộn gỏi cùng tỏi, ớt băm, múc ra chén. Bánh phồng tôm chiên giòn rồi dọn ra cùng với gỏi và nước chấm.\n" +
                        " \n" +
                        "Giờ thì cả nhà dùng thôi, món gỏi ngó sen tôm thịt sẽ đổi mới được thực đơn nhà bạn và giúp mọi người ăn ngon miệng hơn.",
                "goi_ngo_sen_tom_thit.jpg",24));
        return tmp;
    }

    public  ArrayList<foodForGV> initFoodForGV4_Utils()
    {
        ArrayList<foodForGV> tmp = new ArrayList<>();
        tmp.add(new foodForGV("Chè hạt sen nhãn nhục",
                "Chè hạt sen nhãn nhục không chỉ có vị thơm mát, ngọt dịu của hạt sen hòa quyện với nhãn nhục, mà còn là món ăn bổ dưỡng cho cơ thể. Như bạn cũng biết nhãn nhục ăn quá nhiều sẽ bị nóng nhưng có một cách để ăn nhãn nhục không lo bị nóng đó là chúng ta đem kết hợp nhãn nhục với hạt sen.\n" +
                        "\n" +
                        "Hạt sen có tính bình nên có thể giải trừ tính nóng của nhãn nhục, ngoài ra 2 nguyên liệu này kết hợp với nhau còn là một trong những bài thuốc hữu hiệu để trị bệnh mất ngủ. Và hôm nay, Daubepgiadinh.vn sẽ hướng dẫn bạn cách nấu chè hạt sen nhãn nhục để bạn chiêu đãi cả nhà nhé.\n" +
                        "    ",
                "Hạt sen tươi 200 gram\n" +
                        "   \n" +
                        "Nhãn nhục 100 gram\n" +
                        "   \n" +
                        "Đường phèn 100 gram",
                "Bước 1: Nếu dùng hạt sen tươi, bạn bóc sạch vỏ, tách bỏ tim sen, nếu dùng hạt sen khô, bạn ngâm mềm trước khi nấu\n" +
                        " \n" +
                        "Bước 2: Nhãn nhục mua về bạn cũng bóc vỏ, bỏ hạt rồi để riêng ra chén. Nếu dùng nhãn nhục khô, bạn rửa sạch, ngâm vào nước lạnh cho nở rồi xả lại dưới vòi nước cho sạch cát và bụi, để vào rổ cho ráo nước.\n" +
                        " \n" +
                        "Bước 3: Sau khi sơ chế, bạn tiến hành nấu mềm hạt sen, đối với hạt sen tươi nấu mềm sẽ giúp hạt sen tươi bớt mủ, nấu hạt sen khô giúp hạt nềm đều khi nấu và tránh bị sượng. Sau khi hầm chín hạt sen, bạn vớt hạt sen ra ngoài. Nếu muốn nước chè không bị đục, sau khi hầm hạt sen xong, bạn xả sơ hạt sen qua nước lạnh.\n" +
                        " \n" +
                        "Bước 4: Sau khi hầm hạt sen xong, bạn khéo léo nhét hạt sen vào bên trong nhãn nhục. Bạn làm cho hết hạt sen và nhãn nhục.\n" +
                        " \n" +
                        "Đường phèn bạn cho vào nồi nước cho sôi và đường tan hết. Tiếp theo, bạn cho hạt sen nhãn nhục vào nấu khoảng 10 phút. Bạn lưu ý không nấu quá lâu vì sẽ làm mất đi độ giòn của nhãn nhục. Nếm thử xem vừa miệng rồi thì tắt bếp.\n" +
                        "    ",
                "che_hat_sen_nhan_nhuc.jpg",25));
        tmp.add(new foodForGV("Chè thạch trái cây pha lê" ,
                "Món chè thạch trái cây pha lê mát lạnh, thơm ngon, đẹp mắt là lựa chọn tuyệt vời cho bạn và cả gia đình vào dịp cuối tuần. Vậy còn chần chừ gì mà không tham khảo ngay cách nấu chè thạch trái cây pha lê tại Bếp Gia Đình – Hướng Nghiệp Á Âu, nấu và chiêu đãi gia đình vào cuối tuần này.",
                "1. Phần nguyên liệu để nấu chè:\n" +
                        "   \n" +
                        " • Thịt quả bơ sáp 200gram\n" +
                        " \n" +
                        " • Sữa tươi 100ml\n" +
                        " \n" +
                        " • Sữa đặc 30gram\n" +
                        " \n" +
                        " • Nước cốt dừa 50ml\n" +
                        " \n" +
                        " • Lá gelatine 4 lá\n" +
                        " \n" +
                        " • Vỏ chanh 1/4 muỗng cà phê\n" +
                        " \n" +
                        "2. Nguyên liệu để làm thạch trái cây\n" +
                        " \n" +
                        " • Các loại trái cây như dâu tây, kiwi, cherry, mít…\n" +
                        " \n" +
                        " • Nước lọc 250ml\n" +
                        " \n" +
                        " • Đường 4 muỗng canh\n" +
                        " \n" +
                        " • Bột rau câu dẻo 1/2 muỗng cà phê\n" +
                        " \n" +
                        " • Khuôn đá hình tròn\n" +
                        " \n" +
                        "3. Nguyên liệu làm nước dừa để chan\n" +
                        " \n" +
                        " • Nước cốt dừa 100ml\n" +
                        " \n" +
                        " • Sữa đặc 4 – 5 muỗng",
                "Cách làm chè bơ:\n" +
                        " \n" +
                        " • Đầu tiên bạn cắt đôi quả bơ, dùng muỗng nạo lấy phần thịt bơ rồi cho vào máy xay sinh tố xay nhuyễn.\n" +
                        " \n" +
                        " • Cho lá genlatin vào nước ngâm cho nở ra. Đổ sữa đặc, sữa tươi, nước cốt dừa vào một chiếc nồi nhỏ, đun sôi rồi cho lá gelatin ngâm nở vào khuấy đều.\n" +
                        " \n" +
                        " • Sau khi hỗn hợp sôi đều một lúc, bạn tắt bếp rồi cho bơ vừa xay nhuyễn vào. Thả ít vỏ chanh bào vào cùng nhé.\n" +
                        " \n" +
                        " • Trộn đều hỗn hợp lên rồi đổ ra khuôn bánh flan, để vào tủ lạnh cho đông lại.\n" +
                        " \n" +
                        "Làm thạch pha lê:\n" +
                        "\n" +
                        " • Hoà tan bột rau câu với đường và nước, để khoảng 15 phút cho nở. Cho bột rau câu vào nồi, bắc lên bếp đun và khuấy liên tục.\n" +
                        " \n" +
                        " • Sau khi đun sôi, bạn bắc xuống để nguội khoảng 3 phút.\n" +
                        " \n" +
                        " • Cắt nhỏ các loại trái cây đã chuẩn bị sẵn như dâu, kiwi, mít cho vào khuôn, đổ thạch đã nấu vào rồi đậy nắp khuôn lại chờ đông khoảng 1 – 2 tiếng.\n" +
                        " \n" +
                        " • Với lượng thạch vừa làm, bạn có thể làm được 10 viên thạch tròn.\n" +
                        " \n" +
                        "Nước cốt dừa để chan:\n" +
                        " \n" +
                        " • Bạn đổ sữa đặc và nước cốt dừa vào nồi, bắc lên bếp đun cho sôi lăn tăn rồi tắt bếp, để nguội.\n" +
                        " \n" +
                        " • Chè bơ lấy ra khỏi khuôn, đổ ra đĩa lòng sâu, gỡ phần thạch trái cây ra rồi cho vào thêm với chè bơ. Chan phần nước cốt dừa vào là bạn đã hoàn thành xong món chè thạch hoa quả này rồi.\n" +
                        " \n" +
                        " • Chắc chắn với hương vị béo béo, ngậy ngậy của chè bơ và vị mềm thơm của thạch trái cây dẻo lạnh sẽ giúp bạn có một món chè ngon tuyệt để chiêu đãi cả nhà đấy.",
                "che_thach_trai_cay.jpg",26));
        tmp.add(new foodForGV("Kem đậu xanh" ,
                "Đậu xanh được biết đến như một “thần dược” trong việc cung cấp chất dinh dưỡng cho cơ thể. Không những thế, đậu xanh còn giúp tăng cường hệ miễn dịch, phòng ngừa các bệnh thường gặp mùa hè như cảm nắng, sốt, tiêu chảy,… Tuy nhiên, các bé thường không mấy thích thú với các món ăn như cháo đậu xanh, chè đậu xanh,… Vậy thì sao bạn không thử nhân dịp cuối tuần làm một ít kem đậu xanh vừa bổ dưỡng vừa mát lạnh để chiều các bé trong mùa hè oi bức sắp tới nào.",
                "Đậu xanh cà vỏ 100gr\n" +
                        "      \n" +
                        "Bột đậu xanh 1 gói\n" +
                        "         \n" +
                        "Bột bắp 1 muỗng\n" +
                        "        \n" +
                        "Bột mì 1 muỗng\n" +
                        "       \n" +
                        "Đường cát trắng 100gr\n" +
                        "        \n" +
                        "Nước lọc 50ml\n" +
                        "        \n" +
                        "Nước cốt dừa 100ml\n" +
                        "        \n" +
                        "Sữa tươi 200 ml\n",
                "Bước 1: Sơ chế nguyên liệu\n" +
                        " \n" +
                        "Đậu xanh vo sạch rồi ngâm trong nước ấm trong khoảng 2 – 3 tiếng để hạt đậu được nở mềm. Sau khi hạt đậu nở mềm, bạn cho vào xửng hấp trong khoảng 10 – 15 phút, hạt đậu chín tới thì bạn tắt bếp và lấy ra để nguội.\n" +
                        " \n" +
                        "Đậu xanh đã nguội, bạn cho vào máy xay rồi xay mịn. Nếu không có máy xay, bạn có thể dùng muỗng tán đậu nhuyễn là được.\n" +
                        " \n" +
                        "Hòa tan bột bắp, bột mì vào 50ml nước ấm.\n" +
                        " \n" +
                        "Bước 2: Làm kem đậu xanh tại nhà\n" +
                        " \n" +
                        "Bạn cho sữa tươi vào nồi nhỏ và bắc lên bếp. Khi sữa sôi nhẹ, bạn thêm đường khuấy đều rồi thêm đậu xanh đã xay nhuyễn vào trộn đều.\n" +
                        " \n" +
                        "Tiếp đó, bạn cho hỗn hợp bột mì, bột bắp đã chuẩn bị vào khuấy từ từ theo chiều kim đồng hồ. Khi hỗn hợp kem bắt đầu đặc lại, bạn thêm bột đậu xanh để kem có mùi thơm hấp dẫn hơn. Hỗn hợp kem sôi lên thì bạn tắt bếp và để nguội.\n" +
                        " \n" +
                        "Khi hỗn hợp kem đã nguội, bạn cho nước cốt dừa vào khuấy đều rồi rót vào các khuôn kem đã chuẩn bị sẵn và cho vào ngăn đá tủ lạnh trong khoảng 5 – 6 tiếng để kem đông lại là bạn có thể thưởng thức rồi đấy.\n" +
                        " ",
                "kem_dau_xanh.jpg",27));
        tmp.add(new foodForGV("Kem khoai môn" ,
                "Kem khoai môn là món tráng miệng rất được yêu thích và thường được gọi nhiều nhất tại các cửa hàng kem không chỉ bởi hương vị thơm béo, ngon lành mà còn bởi màu sắc hấp dẫn. Thế nhưng đôi khi những loại kem khoai môn được bày bán tại các cửa hàng lại không đảm bảo được chất lượng và vệ sinh an toàn thực phẩm để bạn có thể an tâm cho gia đình thưởng thức.",
                "400 – 500 gram khoai môn\n" +
                        "         \n" +
                        "250 ml kem tươi\n" +
                        "         \n" +
                        "Nước cốt dừa: 1 lon1 hộp sữa chua\n" +
                        "         \n" +
                        "Sữa đặc: 1 lon",
                "Bước 1: Khoai môn chọn loại khoai tím, mua về rửa thật sạch, gọt vỏ, cắt thành từng khúc nhỏ rồi cho vào nồi hấp chín. Nhiều người có thể để khoai nguyên vỏ và mang đi hấp rồi mới gọt vỏ như vậy thì bạn sẽ không gặp phải tình trạng ngứa tay khi gọt vỏ khoai. Khoai môn sau khi hấp chín thì để vớt ra để ráo.\n" +
                        " \n" +
                        "Bước 2: Cho khoai môn đã hấp vào máy xay nhuyễn cùng với một chút sữa tươi không đường.\n" +
                        " \n" +
                        "Bước 3: Cho kem tươi, sữa chua, sữa đặc và nước cốt dừa vào một chiếc âu lớn, đặt vào thau nước lạnh rồi dùng máy đánh trứng đánh hỗn hợp trên trong vòng 20 phút. Đây là công đoạn quan trọng để bạn có được một mẻ kem ngon lành. Không nên đánh kem quá lâu sẽ làm kem bị dăm đá, nhưng đánh không tới thì kem sẽ không mịn.\n" +
                        " \n" +
                        "Bước 4: Sau khi đã đánh xong hỗn hợp bạn cho phần khoai môn xay nhuyễn vào. Bí quyết để phần kem khoai môn có màu sắc đẹp mắt là việc bạn có thể cho thêm một củ khoai lang tím vào phần khoai ban đầu khi chuẩn bị nguyên liệu. Sau khi cho khoai vào bạn trộn đều hỗn hợp đến khi hỗn hợp đồng nhất là được.\n" +
                        " \n" +
                        "Bước 5: Cho hỗn hợp kem khoai môn vào trong ngăn mát đá tủ lạnh trong vòng 5 – 6 tiếng là có thể dùng được.\n" +
                        " \n" +
                        "Món kem khoai môn tự thực hiện chắc chắn sẽ không có hương thơm ngào ngạt của khoai môn vì bạn không sử dụng hương liệu tổng hợp như ngoài tiệm nên bạn có thể hoàn toàn yên tâm về chất lượng của kem.\n" +
                        "   ",
                "kem_khoai_mon.jpg",28));
        tmp.add(new foodForGV("Kem chuối bịch",
                "Cách làm kem chuối với sữa đặc như thế nào, làm sao để kem ngon như các cửa hàng bán kem là thắc mắc của những ai yêu thích kem chuối và đang muốn thực hiện món kem này tại nhà. Tưởng khó khăn nhưng thực ra lại cực kỳ đơn giản, bạn không cần phải là chuyên gia hay cần khéo léo mới có thể làm được. Với các nguyên liệu dễ kiếm như chuối sứ, sữa đặc, đường, đậu phộng, dừa nạo,… cùng hướng dẫn chi tiết các bước thực hiện dưới đây, chắc chắn bạn sẽ thành công.",
                "Dừa non nạo: 100gr\n" +
                        "\n" +
                        "Nước cốt dừa: 500 – 600ml\n" +
                        " \n" +
                        "Chuối sứ chín: 10 quả\n" +
                        " \n" +
                        "Đậu phộng rang dã nhỏ: 100gr\n" +
                        " \n" +
                        "Bột năng: 4 thìa cafe\n" +
                        " \n" +
                        "Muối: 1 chút\n" +
                        " \n" +
                        "đường: 50gr\n",
                "Bước 1: Chuẩn bị một chiếc nồi bắc lên bếp, đổ nước cốt dừa vào nồi, thêm chút đường và muối vào khuấy đều. Để kem chuối béo và thơm hơn, bạn cho thêm sữa đặc vào, hoặc thay thế nước cốt dừa bằng sữa tươi đều được nhé.\n" +
                        " \n" +
                        "Bước 2: Lấy một chiếc bát nhỏ, cho chút nước và bột năng vào khuấy đều sau đó đổ hỗn hợp này vào nồi nước cốt dừa đang bắc trên bếp. Bật lửa, vừa đun vừa khuấy đều cho đến khi hỗn hợp hơi sền sệt là được.\n" +
                        " \n" +
                        "Bước 3: Chuối sứ bạn lựa trái ngon, chín vừa, lột vỏ rồi cắt đôi theo chiều dọc của chuối. Nếu muốn bạn có thể để nguyên trái chuối cũng được nhé. Tiếp đến bạn dùng bịch ni lông để làm kem chuối bịch ra, cho chuối vào bên trong. Dùng tay ép dẹp chuối.\n" +
                        " \n" +
                        "Bước 4: Tiếp tục, bạn đổ phần nước cốt dừa và bột năng vừa làm ở bước 2 rưới lên 2 bề mặt của chuối sao cho đều sau đó bạn phủ thêm đậu phộng và dựa nạo sợi lên xung quanh. Làm tương tự cho đến khi hết chuối và các nguyên liệu.\n" +
                        " \n" +
                        "Bước 5: Cho bịch kem chuối vừa làm xong để vào ngăn mát tủ lạnh khoảng 4 – 5 tiếng để cho kem đông lại là hoàn thành.\n" +
                        " \n" +
                        "Như vậy, chúng ta đã hoàn thành món kem chuối trên. Ngoài ra bạn cũng có thể học thêm cách làm kem chuối bịch không cần nước cốt dừa để thay thế nếu trong nhà không có sẵn dừa nhé.\n",
                "kem_chuoi_thom_ngon.jpg",29));
        tmp.add(new foodForGV("Kem bạc hà" ,
                "Học làm kem bạc hà dẻo mịn, béo ngậy có màu xanh mướt mát rất bắt mắt. Từng viên kem mát lịm đến tê lưỡi giúp bạn đánh tan cái nóng nực trong chốc lát.\n" +
                        "    Cùng vào bếp với daubepgiadinh.vn để học làm kem ngon này để chiêu đãi cả nhà vào dịp cuối tuần này nhé.",
                "Lòng đỏ trứng 2 cái\n" +
                        "  \n" +
                        "Đường 30gr\n" +
                        " \n" +
                        "Sữa 200gr\n" +
                        " \n" +
                        "Siro bạc hà 3 muỗng canh\n" +
                        " \n" +
                        "Kem tươi whipping cream 100 gr\n" +
                        "  \n" +
                        "Hạt điều 40gr cắt nhỏ (hoặc quả óc chó, hạnh nhân hoặc loại hạt khác tùy thích)",
                "Bước 1: Trước khi bắt đầu làm kem, bạn cho hộp đựng kem vào ngăn đông tủ lạnh trước 3 giờ rồi mới bắt đầu làm để giúp kem mau đông.\n" +
                        " \n" +
                        "Bước 2: Đập trứng ra tô, đánh tan cùng với đường cát trắng cho đến khi hỗn hợp ngả màu vàng nhạt thì dừng.\n" +
                        " \n" +
                        "Bước 3: Đổ sữa vào nồi, đun sôi cho đến khi thấy bọt sủi lăn tăn ở xung quanh mép nồi thì từ từ đổ vào hỗn hợp trứng, vừa đổ vừa đánh cho tan.\n" +
                        " \n" +
                        "Bước 4: Đổ hỗn hợp đường trắng vào nồi, đun sôi trên lửa nhỏ, vừa đun vừa khuấy liên tục để hỗn hợp không bị bén nồi và trứng không bị chín. Cứ đảo như vậy cho đến khi bạn thấy hơi nặng tay, hỗn hợp trứng sữa hơi đặc lại thì tắt bếp.\n" +
                        " \n" +
                        "Bước 5: Chờ cho hỗn hợp nguội bớt đến nhiệt độ phòng thì đổ siro bạc hà vào khuấy đều. Đổ kem tươi ra thố trộn, đánh cho bông nhẹ rồi đổ hỗn hợp trứng sữa vào trộn đều.\n" +
                        " \n" +
                        "Bước 6: Cho hỗn hợp kem vào hộp đựng kem rồi cho vào ngăn đá, cứ sau khoảng 1 tiếng thì đem ra đảo tơi bằng nĩa. Vào lần đảo tơi đầu tiên, bạn cho hạt đều cắt nhỏ vào trộn đều. Sau đó dàn đều mặt kem, đậy kín rồi bỏ vào ngăn đông trở lại. Bạn lặp lại thao tác đảo tơi chừng 4 – 5 lần sẽ xong món kem bạc hà ngon lành.\n" +
                        " \n" +
                        "Trong cái tiết trời oi nóng mà thưởng thức ly kem bạc hà mát lạnh thì thật không gì tuyệt bằng. Kem bạc hà dẻo mịn, béo ngậy có màu xanh mướt mát rất bắt mắt và hấp dẫn.\n" +
                        " \n" +
                        "Chúc bạn thành công khi thực hiện.\n",
                "kem_bac_ha.jpg",30));
        tmp.add(new foodForGV("Mứt bí đao" ,
                "Một mùa Tết nữa lại sắp đến, đây là thời điểm mà các chị em nội trợ lại rôm rả truyền tai nhau những bí quyết làm mứt ngon cho cả gia đình thưởng thức. Trong số các loại mứt quen thuộc thì mứt bí đao cũng là một trong những loại mứt được nhiều người yêu thích bởi hương vị ngon ngọt, the mát, màu sắc đẹp mắt. Cùng Daubepgiadinh.vn cùng nhau tìm cách làm mứt bí đao ngon ngọt, an toàn cho ngày Tết nhé.",
                "Bí đao 2kg (chọn loại quả già)\n" +
                        " \n" +
                        "Nước vôi trong\n" +
                        " \n" +
                        "Đường kính trắng 1,5kg\n" +
                        " \n" +
                        "Vani 1 ống\n" +
                        " \n" +
                        "Phèn chua 25gram",
                "Bước 1: Sơ chế bí đao\n" +
                        " \n" +
                        "Bí đao mua về bạn gọt vỏ và bỏ hột, rửa sạch rồi để ráo nước.\n" +
                        " \n" +
                        "Cắt bí thành từng miếng dài khoảng từ 5 – 7 cm, đường kính 1 cm.\n" +
                        " \n" +
                        "Bước 2: Xử lý bí đao\n" +
                        " \n" +
                        "Hòa tan vôi với 1.5 lít nước lạnh, để khoảng 30 phút cho cặn lắng xuống rồi lọc lấy phần nước trong ở bên trên.\n" +
                        " \n" +
                        "Cho phèn chua đã chuẩn bị vào cùng nước vôi, ngâm bí đao trong hỗn hợp này khoảng từ 6 – 8 tiếng.\n" +
                        " \n" +
                        "Sau khi ngâm bí đao xong, bạn vớt bí ra và rửa đi rửa lại thật nhiều lần với nhiều lần với nước lần để bí đao sạch vôi và phèn chua. Sau đó, bạn dùng khăn lau khô hoặc trải bí lên khay, để bí ra nơi có gió để bí khô nhanh.\n" +
                        " \n" +
                        "Bước 3: Ướp bí đao\n" +
                        " \n" +
                        "Ướp phần bí đã được sơ chế với đường theo tỉ lệ 1 kg bí thì dùng 750 gram đường. Trong quá trình ướp, bạn đừng quên thỉnh thoảng đảo đều để bí có thể ngấm thật đều đường.\n" +
                        " \n" +
                        "Để ướp trong vòng 4 – 5 tiếng, khi nào thấy đường tan hết là được. Bạn lưu ý cách làm mứt bí này rất chú trọng thời gian ướp vì ướp bí cùng đường không đủ lâu có thể làm mứt bị nhạt, mềm và không ngon.\n" +
                        " \n" +
                        "Bước 4: Sên mứt bí\n" +
                        " \n" +
                        "Sau khi đã ướp xong bí với đường, bạn cho hỗn hợp bí cùng với đường vào một chiếc chảo sâu lòng, bắc lên bếp đun với lửa trung bình. Dùng đũa đảo sơ qua một chút để đường có thể được tan hết, bí và đường hòa quyện vào nhau.\n" +
                        " \n" +
                        "Khi thấy phần nước đường đã dần cạn và dấu hiệu hơi sệt lại thì vặn lửa liu riu, đảo đều tay liên tục.\n" +
                        " \n" +
                        "Bước 5:\n" +
                        " \n" +
                        "Khi thấy đường đã kết tinh và tạo thành một lớp áo trắng tin bên ngoài miếng bí thì thao tác thật nhanh tay để cho vani vào để món mứt bí thơm hơn.\n" +
                        " \n" +
                        "Nếu mứt bí vẫn còn hơi ướt thì bạn nên đun thêm một chút nữa mới tắt bếp để mứt bí có thể tự khô. Chú ý mứt bí phải khô thì bạn mới có thể bảo quản được trong thời gian lâu.\n" +
                        " \n" +
                        "Với cách làm mứt bí đao này của daubepgiadinh.vn, hy vọng bạn có thể chuẩn bị được món mứt bí ngọt ngào để đãi cả nhà trong dịp Tết rồi.\n" +
                        " \n" +
                        "Chúc bạn thành công khi thực hiện.",
                "mut_bi.jpg",31));
        tmp.add(new foodForGV("Mứt gừng cay" ,
                "Mứt gừng là một món không thể thiếu cho những ngày Tết. Mứt gừng không chỉ ngon mà còn ấm nóng, giúp bạn phòng ngừa cảm, trúng gió… Cách làm món ăn chơi này cũng không hề khó, chỉ với vài bước đơn giản, bạn đã có thể tạo ra những miếng mứt vàng ươm, cay cay, ngon miệng để cùng cả nhà thưởng thức cùng những tách trà trong ngày Tết nguyên đán.",
                "1 kg củ gừng (không chọn gừng quá non hoặc gừng già)\n" +
                        " \n" +
                        "Vani1 ít nước cốt chanh hoặc phèn chua\n" +
                        "  \n" +
                        "700gram đường trắng",
                "Bước 1:\n" +
                        " \n" +
                        "Gừng bạn chọn những củ vừa. Mua gừng về bạn dùng dao cạo sạch vỏ rồi rửa sạch dưới vòi nước lạnh sau đó để cho ráo, thái thành những lát vừa mỏng. Lưu ý là không nên thái gừng quá mỏng sẽ làm cho món mứt bị cong. Thái xong, bạn ngâm gừng vào nước lạnh.\n" +
                        " \n" +
                        "Bước 2:\n" +
                        " \n" +
                        "Bạn chuẩn bị một cái nồi sạch, bắc nồi nước nước lên bếp và đun sôi. Cho thêm một chút muối và phèn chua vào nồi sau đó trút toàn bộ số gừng đã thái lát vào luộc vài phút.\n" +
                        " \n" +
                        "Luộc sơ xong, bạn đổ nước đi, lấy nước sạch vào nồi, tiếp tục luộc như bước vừa rồi. Làm vài lần như vậy để gừng bớt cay. Cuối cùng, bạn thả gừng vào trong một chậu nước lạnh và ngâm cho gừng nguội hẳn rồi vớt ra để ráo.\n" +
                        " \n" +
                        "Bước 3:\n" +
                        " \n" +
                        "Chuẩn bị một cái tô sạch, cho gừng vào, tiếp tục cho đường rồi trộn đều lên. Bạn để tô gừng ướp qua đêm, nếu không có thời gian thì ướp ít nhất là 4 tiếng.\n" +
                        " \n" +
                        "Trong thời gian ướp, lâu lâu bạn đảo đều cho đường thấm hẳn.\n" +
                        " \n" +
                        "Bước 4:\n" +
                        " \n" +
                        "Sau khi đã ướp xong gừng, bạn cho tất cả vào một cái chảo dày và bắt đầu sên. Khi thấy sôi thì bạn hạ lửa. Đảo đều và liên tục đến khi đường kết tinh bám ở đáy chảo, phần mứt gừng bắt đầu khô ráo thì mới tắt bếp.\n" +
                        " \n" +
                        "Bạn dùng đũa đảo cho đến khi mứt khô hoàn toàn.\n" +
                        " \n" +
                        "Khi mứt gừng nguội, bạn cho vào hũ thủy tinh để bảo quản được lâu.\n" +
                        " \n" +
                        "Một số lưu ý khi làm mứt gừng:\n" +
                        " \n" +
                        "Không chọn gừng non, sẽ kém ngon. Chọn gừng già quá sẽ dễ bị xơ và có độ cay rất cao.\n" +
                        "  \n" +
                        "Khi sên mứt, bạn cho lửa nhỏ để gừng thấm đều và chín từ từ, tránh khét.\n" +
                        " \n" +
                        "Bạn nên cho cả vụn đường sau khi sên vào hũ thủy tinh cùng với gừng để bảo quản lâu hơn nhé.\n" +
                        "  \n" +
                        "Chúc các bạn thành công với món mứt gừng thơm ngon, hấp dẫn này.",
                "mut_gung.jpg",32));
        return tmp;
    }
}