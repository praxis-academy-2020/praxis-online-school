<template>
  <div>
    <!-- card -->
    <v-col>
      <v-card class="mx-auto d" max-width="200" :elevation="4">
        <v-img max-height="100" :src="poto"></v-img>
        <h3 class="mt-7 mb-7 text-center">{{ judul }}</h3>

        <v-row justify="center" class="pb-5">
          <v-dialog
            v-model="dialog"
            fullscreen
            hide-overlay
            transition="dialog-bottom-transition"
          >
            <template v-slot:activator="{ on, attrs }">
              <v-btn
                large
                color="#03A1EA"
                class="white--text text-capitalize"
                v-bind="attrs"
                v-on="on"
                >Open Dialog</v-btn
              >
            </template>
            <v-card>
              <v-toolbar dark color="primary">
                <v-btn small icon dark @click="dialog = false">
                  <v-icon>mdi-close</v-icon>
                </v-btn>
                <v-toolbar-title>{{ namakarya }}</v-toolbar-title>
                <v-spacer></v-spacer>
              </v-toolbar>

              <!-- modal -->

              <v-row class="mt-10">
                <v-col cols="3" class="d-none d-sm-flex">
                  <v-img
                    src="@/assets/kanan1.png"
                    width="250"
                    class="center"
                  ></v-img>
                </v-col>
                <v-col class="d-flex justify-center" cols="12" sm="6">
                  <!-- <v-img :src="poto" max-width="400" class="ukurann"></v-img> -->
                  <section>
                    <iframe
                      width="700"
                      height="350"
                      :src="vid"
                      frameborder="0"
                      allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                      allowfullscreen
                    ></iframe>
                  </section>
                </v-col>
                <v-col cols="3" class="d-none d-sm-flex">
                  <v-img
                    src="@/assets/kiri1.png"
                    width="300"
                    class="center"
                  ></v-img>
                </v-col>
                <v-col cols="12" sm="12" class="text-center mt-5 mb-5">
                  <div>
                    <h1>Deskripsi Karya:</h1>
                    <p class="mt-5">{{ deskripsii }}</p>

                    <h1 class="mt-15">Nama Team:</h1>

                    <v-row class="text-center">
                      <v-col cols="12" sm="4">
                        <v-img
                          src="@/assets/profil.png"
                          width="200"
                          class="center"
                        ></v-img>
                        <h4>lorem</h4>
                        <h6>Python</h6>
                      </v-col>
                      <v-col cols="12" sm="4">
                        <v-img
                          src="@/assets/profil.png"
                          width="200"
                          class="center"
                        ></v-img>
                        <h4>justien</h4>
                        <h6>Fullstack</h6>
                      </v-col>
                      <v-col cols="12" sm="4">
                        <v-img
                          src="@/assets/profil.png"
                          width="200"
                          class="center"
                        ></v-img>
                        <h4>ben10</h4>
                        <h6>Frontend</h6>
                      </v-col>
                    </v-row>
                    <br />

                    <a
                      :href="link"
                      target="_blank"
                      class="text-decoration-none"
                    >
                      <v-btn color="#112d4e" class="mx-auto center huruf"
                        >GITHUB</v-btn
                      >
                    </a>
                  </div>
                </v-col>
              </v-row>
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
      widgets: false,
    };
  },
  props: [
    "judul",
    "deskripsi",
    "poto",
    "namakarya",
    "",
    "deskripsii",
    "link",
    "vid",
  ],
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
.hero-image {
  background-color: #cccccc;
}
.a {
  border: 1px solid red;
}
iframe {
  border-radius: 10px;
}
.d {
  border-radius: 20px;
}
</style>