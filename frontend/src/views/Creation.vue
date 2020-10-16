<template>
  <div>
    <navbarHome :isInverted="false" />
    <div v-if="isLoading">
      <v-progress-circular class="mt-15" :width="3" indeterminate color="primary"></v-progress-circular>
    </div>
    <div v-else>
      <cardssss class="mt-15" />
    </div>
    <foot />
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import cardssss from "@/components/karya/card.vue";

export default {
  name: "Home",
  data() {
    return {
      isLoading: false
    };
  },
  components: {
    navbarHome,
    foot,
    cardssss
  },
  beforeCreate() {
    // loading
    this.isLoading = true;
    this.$store.dispatch("getApiKarya");
    this.isLoading = false;

    // check route
    if (!localStorage.getItem("Bearer")) {
      scrollTo(0, 0);
    } else {
      this.$router.push({ name: "Dashboard" });
    }
  }
};
</script>
