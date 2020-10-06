<template>
  <div>
    <!-- card -->
    <v-col>
      <v-card class="mx-auto" max-width="200" :elevation="4">
        <v-img max-height="100" :src="poto"></v-img>
        <h3 class="mt-7 mb-7 text-center">{{judul}}</h3>

        <v-row justify="center" class="pb-5">
          <v-dialog v-model="dialog" fullscreen hide-overlay transition="dialog-bottom-transition">
            <template v-slot:activator="{ on, attrs }">
              <v-btn color="#112d4e" dark v-bind="attrs" v-on="on" small>Open Dialog</v-btn>
            </template>
            <v-card>
              <v-toolbar dark color="primary">
                <v-btn small icon dark @click="dialog = false">
                  <v-icon>mdi-close</v-icon>
                </v-btn>
                <v-toolbar-title>{{namakarya}}</v-toolbar-title>
                <v-spacer></v-spacer>
              </v-toolbar>

              <!-- modal -->
              <v-container>
                <v-row>
                  <v-col class="d-flex justify-center" cols="12" sm="12">
                    <!-- <v-img :src="poto" max-width="400" class="ukurann"></v-img> -->
                    <section>
                  <iframe  width="560" height="315" :src="vid" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                 </section>
                  </v-col>

                  <v-col cols="12" sm="12" class="text-center mt-5 mb-5">
                    <div>
                       <h2>Deskripsi Karya:</h2>
                      <p>{{deskripsii}}</p>
                      <br />
                      <h4>Nama Team:</h4>
                     
    <v-row class="text-center">
      <v-col cols="12" sm="4">
        <v-img src="@/assets/profil/robi.png" width="200" class="center"></v-img>
        <h4>Hadi Hidayat Hammurabi</h4>
        <h6>Mentor Python</h6>
      </v-col>
      <v-col cols="12" sm="4">
        <v-img src="@/assets/profil/akbar.png" width="200" class="center"></v-img>
        <h4>Muhammad Akbar H</h4>
        <h6>Mentor Fullstack</h6>
      </v-col>
      <v-col cols="12" sm="4">
        <v-img src="@/assets/profil/hendi.png" width="200" class="center"></v-img>
        <h4>Hendi Saputra</h4>
        <h6>Mentor Frontend</h6>
      </v-col>
    </v-row>
                      <br />
                     
                      <a :href="link" target="_blank" class="text-decoration-none">
                        <v-btn color="#112d4e" class="mx-auto center huruf">GITHUB</v-btn>
                      </a>
                    </div>
                  </v-col>
                </v-row>
              </v-container>
            </v-card>
          </v-dialog>
        </v-row>
      </v-card>
    </v-col>
  </div>
</template>

<script>
export default {
  data() {
    return {
      dialog: false,
      notifications: false,
      sound: true,
      widgets: false
    };
  },
  props: [
    "judul",
    "deskripsi",
    "poto",
    "namakarya",
    "deskripsii",
    "link",
    "vid"
  ]
};
</script>

<style  scoped>
.huruf {
  color: white;
}
.ukurann {
  margin-top: 20%;
  height: 200px;
  width: 10px;
}
.center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}
</style>