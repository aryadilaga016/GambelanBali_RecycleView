package com.example.recycleviewarya;

import java.util.ArrayList;

public class DataGambelan {
    private static String[] namaGambelan= {
            "Ceng - ceng",
            "Gangsa",
            "Gender",
            "Genggong",
            "Jublag dan Gegogan",
            "Kajar",
            "Kempli",
            "Kendang Bebarongan",
            "Kendang Bedug",
            "Kendang Cedugan",
            "Kendang Gupekan",
            "Kendang Krumpung",
            "Kendang Mebarung",
            "Kendang Tabur",
            "Ponggang",
            "Reyong",
            "Tingklik"
    };

    private static String[] detailGambelan ={
            "Alat musik ceceng merupakan alat tradisional bali. alat musik cengceng telah dikenal lama oleh banyak orang . alat musik ini mempunyai suara yang keras dan meggelegar gambelan ini sering digunakan sebagai upacara orang bali dan lain sebagainya. sungguh kaya warisan budaya yang harus di lestarikan.",
            "Gangsa merupakan alat musik Bali dalam barungan gambelan berbentuk bilah terbuat dari perunggu. Bilahannya berjumlah 10 buah yang masing-masing memiliki fungsi yang berbeda. Ada yang berfungsi sebagai jalinan pukulan, ada juga menjadi penentu matra-matra lagu, dan lain sebagainya",
            "Gender adalah salah satu instrumen musik metalofon dalam Gamelan Jawa dan Gamelan Bali. Alat musik berbilah 10 (dua oktaf) yang bentuknya menyerupai gangsa ini merupakan instrumen pokok dalam barungan gender wayang, barungan alit sebagai gamelan Pewayangan.",
            "Genggong merupakan alat musik tradisional Bali, instrumen getar yang dimainkan dengan cara mengulum bagian yang disebut “pelayah“. Dalam hal ini rongga mulut pemain yang membunyikannya berfungsi sebagai resonator",
            "Jegongan merupakan instrumen metalolofon nada terendah dalam kelompok instrumen gong kebyar. Sementara itu, jublag nadanya lebih tinggi dengan tempo permainan lebih cepat dari jegongan",
            "Instrumen kajar dan tawa-tawa adalah instrumen yang berfungsi sebagai pemegang matra atau tempo",
            "Kempli merupakan instrumen yang terdiri dari satu blok gong kecil yang berfungsi untuk menandai tempo dari permainan gangsa",
            "Kendang bebarongan adalah kendang yang secara khusus terdapat dalam barungan gamelan Bebarongan. Jenis kendang ini mempunyai panjang sekitar 62-65cm, garis tengah tebokan besar 26-28cm dan garis tengah tebokan kecil sekitar 21,5-23cm. Kendang bebarongan ini termasuk dalam ukuran kendang yang tanggung (nyalah:Bahasa Bali), karena ukurannya yang tidak terlalu besar maupun tidak terlalu kecil. Ada dua cara untuk memainkan kendang bebarongan, yakni bisa dengan mempergunakan panggul dan bisa juga dimainkan tanpa menggunakan panggul",
            "Kendang bedug atau bebedug adalah salah satu jenis kendang yang mirip bentuk dan cara permainannya dengan kendang tambur, akan tetapi memiliki ukuran yang lebih kecil. Jenis kendang ini merupakan salah satu instrumen dari barungan gamelan Gong Beri. Jenis gamelan ini dipergunakan untuk musik tarian sakral Baris Cina. Perangkat barungan gamelan Gong Beri hanya dapat ditemukan di Desa Renon dan Banjar Semawang, Denpasar Selatan",
            "Kendang cedugan adalah kendang yang dalam teknik permainannya menggunakan panggul. Oleh karena itu, kendang ini juga disebut dengan nama kendang pepanggulan. Kendang pepanggulan ini mempunyai ukuran panjang antara 69-72cm, garis tengah tebokan besar 29-32cm dan garis tengah tebokan kecil 22-26cm. Jenis kendang ini biasanya dipergunakan pada beberapa perangkat gamelan, misalnya Gong Kebyar, Baleganjur, dan Gong Gede. Kendang pepanggulan dimainkan secara berpasangan yang terdiri dari kendang lanang dan wadon",
            "Kendang gupekan merupakan salah satu jenis kendang yang cara memainkannya adalah dengan memukul memakai tangan. Kendang ini digunakan untuk mengiringi gamelan Gong Kebyar. Kendang ini selain dapat disajikan dengan berpasangan dapat juga dimainkan secara mandiri atau kendang tunggal. Kendang wadon mempunyai ukuran panjang antara 67-72cm, diameter tebokan besar 27-32cm dan diameter tebokan kecil 21-25cm. Kendang lanang mempunyai ukuran serta suaranya lebih kecil dari kendang wadon. Ukuran panjangnya antara 65-70cm, diameter tebokan besar 26-29cm dan diameter tebokan kecil 19-22cm",
            "Kendang krumpungan, kata krumpungan berasal dari kata pung yaitu menirukan suara kendang tersebut (onomatopea atau peniruan bunyi). Jenis kendang ini dipukul hanya menggunakan tangan. Kendang ini biasanya dipergunakan untuk mengiringi gamelan Pegambuhan dan gamelan Palegongan. Kendang krumpungan ini selalu dimainkan berpasangan yaitu kendang lanang dan kendang wadon. Kendang wadon mempunyai diameter tebokan besar 24,5-25cm, panjang antara 55-57cm dan diameter tebokan kecil 20cm. Sedangkan kendang lanang mempunyai diameter tebokan besar 23,5-24cm, panjang antara 55-57cm, diameter tebokan kecil 19,5-20cm",
            "Kendang mebarung merupakan jenis kendang dengan ukuran yang terbesar dalam karawitan Bali. Ukuran kendang ini bisa mencapai panjang 185-200cm dengan diameter antara 74-80cm. Kendang mebarung merupakan salah satu instrumen dari barungan Gamelan Angklung (selendro empat nada). Jenis kendang ini hanya dapat ditemukan di satu daerah saja yakni di Kabupaten Jembrana.",
            "Kendang tambur merupakan jenis kendang dengan ukuran terbesar kedua. Kendang tambur dapat dijumpai di Kabupaten Karangasem dan dipergunakan untuk dua hal yaitu sebagai pelengkap dalam konteks upacara Dewa Yadnya dan juga untuk mengiringi prajurit kerajaan yang akan berangkat ke medan perang. Kendang tambur ini mempunyai ukuran panjang sekitar 72cm, diameter tebokan besar 54cm dan diameter tebokan kecil 44cm. Cara mempermainkan kendang ini dengan mempergunakan dua buah panggul dengan memukul kedua belah sisinya",
            "Ponggang adalah instrumen yang sama bentuknya dengan riyong. Dalam satu tungguh reyong gamelan Gong Kebyar atau gamelan Gong Cede, ponggang terdapat pada nada dung (7)dan dang (1) yang paling besar dari sederetan nada riyong tersebut",
            "Reyong adalah instrumen musik berupa kumpulan dua belas gong kecil yang dimainkan dalam gamelan bali. Reyong terbuat dari campuran timah murni dan tembaga atau bahan besi atau pelat dan berwarna keemasan tergantung bahan yang digunakan. Tinggi rendahnya nada yang dihasilkan sebuah pencon reyong ditentukan oleh ukuran dan tonjolan reyong. Semakin besar ukurannya, semakin rendah nada yang dihasilkan, dan semakin cembung tonjolannya nada yang dihasilkan semakin tinggi. Reyong ditabuh oleh empat orang pemain dengan masing-masing tabuh pada tangan kanan dan kiri. Setiap pemain menabuh gong yang menghasilkan beberapa nada berbeda sehingga permainan dilakukan secara bergantian. Dalam memainkan reyong, terdapat aturan gangsa norot dengan improvisasi yang dilakukan pemain. Improvisasi yang dilakukan oleh seorang pemain harus selaras dengan pemain lainnya agar menghasilkan alunan yang enak didengar. [1] Di dalam lontar Prakempa, terdapat teknik memainkan reyong yang disebut ubit-ubitan, mengacu pada teknik permainan polos dan sangsih yang disebut gagebug",
            "Tingklik atau disebut juga dengan rindik atau juga grantang merupakan alat musik khas Bali yang menghasilkan suara mengalir dan bergemirincing. Secara tradisional alat musik gambang bambu ini digunakan untuk mengiringi pertunjukan tarian Bali, yakni joged bumbung. Instrumen ini dimainkan dengan palu yang ujungnya berupa bundaran karet dari ban bekas."

    };

    private static int[] imageGambelan={
            R.drawable.cengceng,
            R.drawable.gangsa,
            R.drawable.gender,
            R.drawable.genggong,
            R.drawable.jublag,
            R.drawable.kajar,
            R.drawable.kempli,
            R.drawable.kendangbebarongan,
            R.drawable.kendangbedug,
            R.drawable.kendangcedugan,
            R.drawable.kendanggupekan,
            R.drawable.kendangkrumpung,
            R.drawable.kendangmebarung,
            R.drawable.kendangtambur,
            R.drawable.ponggang,
            R.drawable.reyong,
            R.drawable.tingklik
    };

    static ArrayList<Gambelan> getListData(){
        ArrayList<Gambelan> list = new  ArrayList<>();
            for (int position = 0; position<namaGambelan.length; position++){
                Gambelan gambelan = new Gambelan();
                gambelan.setNama(namaGambelan[position]);
                gambelan.setDetail(detailGambelan[position]);
                gambelan.setPhoto(imageGambelan[position]);
                list.add(gambelan);
            }
            return list;
    }
}
