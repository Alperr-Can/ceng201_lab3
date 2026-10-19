/*
* Alper Can
* 240444001
* 19.10.2026
 */

public class MusicPlaylist {
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    public MusicPlaylist() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        if(head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteSong(String title) {
        SongNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }

        // Silinen şarkı current ve bi sonraki çarkı varsa current'ı bi sonraki yap yoksa bi önceki yap
        if (temp == current) {
            if (current.next != null) {
                current = current.next;
            } else {
                current = current.prev;
            }
        }

        // Listede tek şarkı varsa ve onu siliyorsak hepsi null, baştaki şarkıyı siliyorsak head artık head.next
        if (temp == head && temp == tail) {
            head = null;
            tail = null;
        } else if (temp == head) {
            head = head.next;
            head.prev = null;
        } else if (temp == tail) { // Sondakini siliyorsak artık bir önceki şarkı sondaki oldu
            tail = tail.prev;
            tail.next = null;
        } else { // Ortadakini siliyorsak
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Removed: " + title);
    }

    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }

    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }

    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Current song: " + current.title);
        } else  {
            System.out.println("Playlist is empty.");
        }
    }

    public void displayPlaylist() {
        SongNode temp = head;
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
