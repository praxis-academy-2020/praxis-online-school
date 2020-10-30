<template>
  <div>
    <nava />
    <div>
      <hero
        title="Frontend developer"
        disk="Program belajar untuk menjadi seorang Frontend developer, meningkatkan skill pemrogramman Frontend, dan GRATIS."
      />
      <pengertian
        :src="gmb"
        judul="Frontend"
        keterangan=" Lorem ipsum dolor sit, amet consectetur adipisicing elit. In, temporibus aliquam! Ab exercitationem ea sequi eius rem? Magni odit ut, dolor quod itaque fuga vel numquam reiciendis sunt, impedit porro?"
      />
      <silabus />
      <ajakan />
    </div>
    <foot />
  </div>
</template>

<script>
import nava from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import hero from "@/components/program/hero.vue";
import pengertian from "@/components/program/pengertian.vue";
import gmb from "@/assets/program/ill1.svg";
import silabus from "@/components/program/silabus.vue";
import ajakan from "@/components/program/ajakan.vue";

export default {
  data() {
    return {
      gmb,
    };
  },
  components: {
    nava,
    foot,
    hero,
    pengertian,
    silabus,
    ajakan,
  },
  beforeCreate() {
    if (!localStorage.getItem("Bearer")) {
      scrollTo(0, 0);
    } else {
      this.$router.push({ name: "Dashboard" });
    }
  }
};
</script>