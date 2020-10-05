<template>
  <div class="mt-15 ml-15">
    <h3>
      <v-icon>mdi-desktop-mac-dashboard</v-icon>DASHBOARD
    </h3>
    <br />
    <v-divider></v-divider>

    <v-container>
      <v-row dense>
        <v-col cols="4">
          <v-card max-width="350" color="#022c43" dark>
            <div class="card-body-icon">
              <font-awesome-icon :icon="crow" size="2x" />
            </div>
            <v-card-title class="headline">Frontend Developer</v-card-title>
            <div class="display-4">80</div>

            <v-card-actions>
              <v-btn text>Detail >>></v-btn>
            </v-card-actions>
          </v-card>
        </v-col>

        <v-col cols="4">
          <v-card max-width="350" color="#115173" dark>
            <div class="card-body-icon">
              <font-awesome-icon :icon="crow" size="2x" />
            </div>
            <v-card-title class="headline">Frontend Developer</v-card-title>
            <div class="display-4">80</div>

            <v-card-actions>
              <v-btn text>Detail >>></v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
        <v-col cols="4">
          <v-card max-width="350" color="#022c43" dark>
            <div class="card-body-icon">
              <font-awesome-icon :icon="crow" size="2x" />
            </div>
            <v-card-title class="headline">Frontend Developer</v-card-title>
            <div class="display-4">80</div>

            <v-card-actions>
              <v-btn text>Detail >>></v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
        <v-col cols="4">
          <v-card max-width="350" color="#115173" dark>
            <div class="card-body-icon">
              <font-awesome-icon :icon="crow" size="2x" />
            </div>
            <v-card-title class="headline">Frontend Developer</v-card-title>
            <div class="display-4">80</div>

            <v-card-actions>
              <v-btn text>Detail >>></v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
        <v-col cols="4">
          <v-card max-width="350" color="#022c43" dark>
            <div class="card-body-icon">
              <font-awesome-icon :icon="crow" size="2x" />
            </div>
            <v-card-title class="headline">Frontend Developer</v-card-title>
            <div class="display-4">80</div>

            <v-card-actions>
              <v-btn text>Detail >>></v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
        <v-col cols="4">
          <v-card max-width="350" color="#115173" dark>
            <div class="card-body-icon">
              <font-awesome-icon :icon="crow" size="2x" />
            </div>
            <v-card-title class="headline">Frontend Developer</v-card-title>
            <div class="display-4">80</div>

            <v-card-actions>
              <v-btn text>Detail >>></v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
import { FontAwesomeIcon } from "@fortawesome/vue-fontawesome";
import { faCode } from "@fortawesome/free-solid-svg-icons";

export default {
  components: {
    FontAwesomeIcon
  },
  data() {
    return {
      crow: faCode
    };
  },
  created() {
    // this.$vuetify.theme.dark = true;
  }
};
</script>

<style scoped>
.card-body-icon {
  position: absolute;
  z-index: 0;
  top: 25px;
  right: 4px;
  opacity: 0.4;
  font-size: 84px;
}
</style>