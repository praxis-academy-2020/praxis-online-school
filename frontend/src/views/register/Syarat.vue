<template>
  <div style="margin-top: 100px">
    <v-container>
      <v-img src="@/assets/p.png" class="center"></v-img>
      <h1 class="text-center mb-10 mt-5">Pendaftaran Praxis Academy</h1>
      <P class="text-justify"
        >Praxis Academy adalah coding school yang khusus mendidik SDM di bidang
        enterprise systems. Coding school ini akan dilaksanakan selama 3
        bulan(on-site Fulltime senin s.d Jumat). Biaya untuk mengikuti ini
        adalah Rp 0. Kami juga tidak menahan ijazah dan sejenisnya, tidak
        memberi kewajiban siswa / alumni menandatangani perjanjian untuk
        membayar jika mereka sudah kerja dan sejenisnya. Sekolah ini terbuka
        untuk semua WNI tanpa memandang SARA, terbuka untuk laki-laki dan
        perempuan.</P
      >
      <h3>Syarat utama:</h3>
      <ol>
        <li>Minimal Lulusan D3/S1</li>
        <li>
          Mempunyai laptop - Disarankan OS Linux(Ubuntu, Manjaro, Suse, dll)
          dengan memory minimal 8 GB (4 GB sebenarnya bisa, tetapi relatif lebih
          lambat). Laptop dengan OS lain dipersilahkan tetapi siswa harus
          bertanggungjawab sendiri terhadap pilihan mereka masing-masing.
        </li>
        <li>
          Bersedia mengikuti proses pendidikan fulltime (9 pagi - 5 sore) sampai
          program selesai.
        </li>
        <li>
          Lolos seleksi (meliputi test kemampuan dasar, wawancara dan asesmen
          kemampuan akademik)
        </li>
        <li>
          <b
            >TIDAK SEDANG DALAM PROSES REKRUITMENT, TIDAK SEDANG BEKERJA /
            MEMPUNYAI IKATAN DENGAN INSTANSI DALAM HUBUNGAN PEKERJAAN.</b
          >
        </li>
        <li>
          Bagi siswa yang telah dinyatakan diterima dan tidak hadir atau tidak
          ikut sampai program selesai maka tidak diperkenankan untuk mengikuti
          program Praxis Academy di kemudian hari.
        </li>
        <li>
          Wajib mengikuti seluruh kegiatan dan tahapan pendidikan bootcamp mulai
          periode awal hingga selesai dan tidak diperkenankan untuk ikut proses
          recruitment lainnya atau sejenisnya selama mengikuti bootcamp.
        </li>
        <li>
          Bersedia memenuhi Kewajiban dan Tata Tertib sebagai peserta pelatihan.
        </li>
        <li>
          Bersedia menjadi mentor / asisten mentor minimal untuk 1 batch
          berikutnya.
        </li>
        <li>
          Apabila anda SUDAH SUBMIT FORM berarti ANDA SETUJU DENGAN SELURUH
          PERSYARATAN DIATAS.
        </li>
        <p>
          Perkecualian terhadap syarat ini dimungkinkan dan diputuskan secara
          internal oleh Praxis Academy.
        </p>
        <P>Tempat:</P>
        <li>YOGYAKARTA</li>
        <ul>
          BIMA HACKERS' VILLAGE :
          <a href="https://s.id/5Xi2a" target="_blank">Klik Disini</a>
        </ul>
        <li>JAKARTA</li>
        <ul>
          Jl. Tegal Parang Utara III no 33 Mampang Prapatan Jakarta Selatan:
          <a href="https://goo.gl/maps/TKpiy8qF97zPYLU69" target="_blank"
            >Klik Disini</a
          >
        </ul>
      </ol>
      <p class="mt-5">
        Proses pendidikan tidak dilakukan secara online, tetapi onsite. Semua
        peserta wajib mengikuti proses di tempat pendidikan. Mohon untuk peserta
        dari luar kota untuk mempersiapkan akomodasi sendiri.
      </p>
      <p>
        Info lebih lanjut (proses pendidikan, kurikulum dan lain-lain), silahkan
        mengunjungi web kami:
        <a href="https://praxisacademy.id" target="_blank">praxisacademy</a>
      </p>
      <p>Terima kasih.</p>
      <v-row>
        <v-col class="d-flex justify-center">
          <v-btn
            large
            color="#03A1EA"
            class="white--text text-capitalize"
            to="/register/formulir"
            >next</v-btn
          >
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  mounted(){
    scrollTo(0, 0);
  }
}
</script>

<style scoped>
.center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 100px;
}
</style>