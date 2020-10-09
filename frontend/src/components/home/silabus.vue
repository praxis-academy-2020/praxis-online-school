<template>
  <v-container>
    <h1 class="text-center mb-8 mt-10">TIMELINE BOOTCAMP</h1>
    <v-row>
      <v-col cols="0" sm="6">
        <v-img class="aa" src="@/assets/orang.png"></v-img>
      </v-col>
      <v-col cols="12" sm="6">
        <v-timeline :dense="$vuetify.breakpoint.smAndDown">
          <v-timeline-item color="amber lighten-1" fill-dot right small>
            <v-card>
              <v-card-title class="amber lighten-1">
                <v-icon dark size="30" class="mr-4">mdi-calendar-text</v-icon>
                <h4 class="white--text font-weight-light">PENDAFTARAN</h4>
              </v-card-title>
              <v-container>
                <v-row>
                  <v-col cols="12" md="10">Lorem ipsum dolor sit amet, no nam oblique veritus.</v-col>
                  <v-col class="hidden-sm-and-down text-right" md="2"></v-col>
                </v-row>
              </v-container>
            </v-card>
          </v-timeline-item>

          <v-timeline-item color="purple lighten-2" fill-dot left>
            <v-card>
              <v-card-title class="purple lighten-2">
                <v-icon dark size="30" class="mr-4">mdi-calendar-text</v-icon>
                <h4 class="white--text font-weight-light">WAWANCARA</h4>
              </v-card-title>
              <v-container>
                <v-row>
                  <v-col cols="12" md="10">Lorem ipsum dolor sit amet, no nam oblique veritus.</v-col>
                  <v-col class="hidden-sm-and-down text-right" md="2"></v-col>
                </v-row>
              </v-container>
            </v-card>
          </v-timeline-item>

          <v-timeline-item color="amber lighten-1" fill-dot right small>
            <v-card>
              <v-card-title class="amber lighten-1">
                <v-icon dark size="30" class="mr-4">mdi-calendar-text</v-icon>
                <h4 class="white--text font-weight-light">BULAN 1</h4>
              </v-card-title>
              <v-container>
                <v-row>
                  <v-col cols="12" md="10">Lorem ipsum dolor sit amet, no nam oblique veritus.</v-col>
                  <v-col class="hidden-sm-and-down text-right" md="2"></v-col>
                </v-row>
              </v-container>
            </v-card>
          </v-timeline-item>

          <v-timeline-item color="purple lighten-2" fill-dot left>
            <v-card>
              <v-card-title class="purple lighten-2">
                <v-icon dark size="30" class="mr-4">mdi-calendar-text</v-icon>
                <h4 class="white--text font-weight-light">BULAN 2</h4>
              </v-card-title>
              <v-container>
                <v-row>
                  <v-col cols="12" md="10">Lorem ipsum dolor sit amet, no nam oblique veritus.</v-col>
                  <v-col class="hidden-sm-and-down text-right" md="2"></v-col>
                </v-row>
              </v-container>
            </v-card>
          </v-timeline-item>

          <v-timeline-item color="amber lighten-1" fill-dot right small>
            <v-card>
              <v-card-title class="amber lighten-1">
                <v-icon dark size="30" class="mr-4">mdi-calendar-text</v-icon>
                <h4 class="white--text font-weight-light">BULAN 3</h4>
              </v-card-title>
              <v-container>
                <v-row>
                  <v-col cols="12" md="10">Lorem ipsum dolor sit amet, no nam oblique veritus.</v-col>
                  <v-col class="hidden-sm-and-down text-right" md="2"></v-col>
                </v-row>
              </v-container>
            </v-card>
          </v-timeline-item>
        </v-timeline>
      </v-col>
    </v-row>
  </v-container>
</template>

<style scoped>
.aa {
  margin-top: 30%;
}
</style>