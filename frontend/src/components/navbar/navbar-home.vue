<template>
  <div>
    <v-card class="mx-auto overflow-hidden ukuran">
      <!-- dekstop -->
      <v-app-bar color="primary" dark fixed :inverted-scroll="isInverted">
        <router-link to="/" class="text-decoration-none">
          <v-toolbar-title>
            <v-img :src="logo" width="50" />
          </v-toolbar-title>
        </router-link>

        <v-spacer></v-spacer>

        <div class="mr-5 hidden-xs-only">
          <v-menu left bottom>
            <template v-slot:activator="{ on, attrs }">
              <div v-bind="attrs" v-on="on">
                <span>Program</span>
              </div>
            </template>

            <v-list>
              <v-list-item>
                <v-list-item-title>Frontend</v-list-item-title>
              </v-list-item>
              <v-list-item>
                <v-list-item-title>Backend</v-list-item-title>
              </v-list-item>
              <v-list-item>
                <v-list-item-title>Fullstack</v-list-item-title>
              </v-list-item>
              <v-list-item>
                <v-list-item-title>Python</v-list-item-title>
              </v-list-item>
              <v-list-item>
                <v-list-item-title>Mobile</v-list-item-title>
              </v-list-item>
              <v-list-item>
                <v-list-item-title>Nodejs</v-list-item-title>
              </v-list-item>
            </v-list>
          </v-menu>
        </div>

        <div class="mr-5 hidden-xs-only">
          <router-link to="/creation" class="text-decoration-none">
            <span class="white--text">Creation</span>
          </router-link>
        </div>

        <div class="mr-5 hidden-xs-only">
          <router-link to="/activity" class="text-decoration-none">
            <span class="white--text">Activity</span>
          </router-link>
        </div>

        <div class="mr-5 hidden-xs-only">
          <router-link to="/register/syarat" class="text-decoration-none">
            <span class="white--text">Bootcamp</span>
          </router-link>
        </div>

        <v-app-bar-nav-icon class="hidden-sm-and-up" @click="sideNav = true"></v-app-bar-nav-icon>
      </v-app-bar>

      <!-- mobile -->
      <v-navigation-drawer v-model="sideNav" right fixed temporary>
        <v-list-item>
          <v-list-item-content>
            <v-list-item-avatar>
              <img :src="logo" />
            </v-list-item-avatar>
          </v-list-item-content>

          <v-list-item-content>
            <v-list-item-title>Praxis</v-list-item-title>
            <v-list-item-subtitle>academy</v-list-item-subtitle>
          </v-list-item-content>

          <v-spacer></v-spacer>

          <v-app-bar-nav-icon class="hidden-sm-and-up" @click="sideNav = false">
            <v-icon>mdi-window-close</v-icon>
          </v-app-bar-nav-icon>
        </v-list-item>

        <v-divider></v-divider>

        <v-list nav dense>
          <v-list-item-group>
            <v-list-item>
              <v-list-item-title class="ukurann">Program</v-list-item-title>
            </v-list-item>

            <router-link to="/creation" class="text-decoration-none">
              <v-list-item>
                <v-list-item-title class="black--text ukurann">Creation</v-list-item-title>
              </v-list-item>
            </router-link>

            <router-link to="/activity" class="text-decoration-none">
              <v-list-item>
                <v-list-item-title class="black--text ukurann">Activity</v-list-item-title>
              </v-list-item>
            </router-link>

            <router-link to="/register/syarat" class="text-decoration-none ukurann">
              <v-list-item>
                <v-list-item-title class="black--text">Bootcamp</v-list-item-title>
              </v-list-item>
            </router-link>
          </v-list-item-group>
        </v-list>
      </v-navigation-drawer>
    </v-card>
  </div>
</template>

<script>
import logo from "@/assets/p.png";

export default {
  data: () => {
    return {
      sideNav: false,
      logo
    };
  },
  props: ['isInverted']
};
</script>
<style scoped>
.ukuran {
  font-size: 12px;
}
.ukurann {
  color: blanchedalmond;
}
.ukurann:hover {
  color: red;
}
</style>