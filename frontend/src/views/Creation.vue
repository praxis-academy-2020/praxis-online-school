<template>
  <div>
    <navbarHome :isInverted="false" />

    <v-container>
      <div
        class="text-h4 text-sm-h3 font-weight-medium"
        style="margin-top: 100px; text-align: center"
      >
        Karya Praxis Academy
      </div>
      <v-row>
        <v-col cols="12" sm="6">
          <cardssss
            src="https://www.youtube.com/embed/UiPv8GGt_Ik"
            class="mt-15"
            hrf="http://salamdoc.id/"
          />
        </v-col>
        <v-col cols="12" sm="6">
          <cardssss
            src="https://www.youtube.com/embed/UiPv8GGt_Ik"
            class="mt-15"
          />
        </v-col>
        <v-col cols="12" sm="6">
          <cardssss
            src="https://www.youtube.com/embed/UiPv8GGt_Ik"
            class="mt-15"
          />
        </v-col>
        <v-col cols="12" sm="6">
          <cardssss
            src="https://www.youtube.com/embed/UiPv8GGt_Ik"
            class="mt-15"
          />
        </v-col>
      </v-row>
    </v-container>
    <foot />
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import cardssss from "@/components/karya/karyo.vue";

export default {
  name: "Home",
  components: {
    navbarHome,
    foot,
    cardssss,
  },
  mounted(){
    scrollTo(0, 0);
  }
};
</script>
