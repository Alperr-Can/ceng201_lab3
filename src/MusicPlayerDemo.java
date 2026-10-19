/**
 * Alper Can
 * 240444001
 * 19.10.2026
 */
public class MusicPlayerDemo {

    public static void main(String[] args) {

        // Playlist oluşturma kısmı
        MusicPlaylist playlist = new MusicPlaylist();

        // Şarkı ekleme kısmı
        playlist.addSong("Shape of You - Ed Sheeran");
        playlist.addSong("Save Me - BTS");
        playlist.addSong("Snap - Manifest");
        playlist.addSong("like JENNIE - JENNIE");

        // Tüm playlisti gösterme kısmı
        System.out.println("=== PLAYLIST ===");
        playlist.displayPlaylist();

        // Şu an çalan şarkıyı gösterme kısmı
        System.out.println("\n=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();

        // Sonraki şarkıya geçme kısmı
        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();

        // Tekrar sonraki şarkıya geçme kısmı
        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();

        // Önceki şarkıya dönme kısmı
        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();

        // İlk şarkıyı ("Shape of You - Ed Sheeran") sil ve playlisteyi göster
        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        playlist.deleteSong("Shape of You - Ed Sheeran");
        playlist.displayPlaylist();

        // "Snap - Manifest" şarkısını sil ve playlisteyi göster
        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        playlist.deleteSong("Snap - Manifest");
        playlist.displayPlaylist();
    }
}