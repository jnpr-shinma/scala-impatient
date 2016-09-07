package sprayssl


object SprayApp extends App {
  SprayDownload.download("https://www.googleapis.com/youtube/v3/channels?part=contentDetails&mine=true")
//  SprayDownload.download("https://10.208.135.125:5905")
}