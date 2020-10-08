<template>
  <div>
    <!-- card -->
    <v-col>
      <v-card class="mx-auto" max-width="200" :elevation="4">
        <v-img max-height="80" :src="poto"></v-img>
        <h5 class="mt-7 mb-7 text-center">{{judul}}</h5>

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
                  <v-col class="d-flex justify-center" cols="12" sm="6">
                    <v-img :src="poto" max-width="400" class="ukurann"></v-img>
                  </v-col>

                  <v-col cols="12" sm="6" class="text-center mt-5 mb-5">
                    <div>
                      <h2>{{judul}}</h2>
                      <br />
                      <h2>Deskripsi :</h2>
                      <p>{{deskripsii}}</p>
                      <br />
                      <router-link to="/register/syarat" class="text-decoration-none">
                        <v-btn color="#112d4e" class="mx-auto center huruf">DAFTAR</v-btn>
                      </router-link>
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
    "namateam",
    "deskripsii",
    "link"
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
.solid {
  border-left: 5px black solid;
  height: 400px;
  width: 0px;
  display: inline-block;
  padding-left: 5px;
}
</style>