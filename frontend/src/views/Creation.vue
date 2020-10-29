<template>
  <div>
    <navbarHome :isInverted="false" />
    <cardssss class="mt-15" />
    <foot />
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import cardssss from "@/components/karya/card.vue";

export default {
  name: "Home",
  components: {
    navbarHome,
    foot,
    cardssss
  },
  beforeCreate() {
    this.$store.dispatch("getApiKarya");

    // check route
    if (!localStorage.getItem("Bearer")) {
      scrollTo(0, 0);
    } else {
      this.$router.push({ name: "Dashboard" });
    }
  }
};
</script>
