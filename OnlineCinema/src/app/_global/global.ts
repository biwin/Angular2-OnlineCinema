export class Global {

  public static get API_FILMS(): string {
    return "http://cinematest.njs.jelastic.vps-host.net/cinema/api/films/";
  }
  public static get API_FILMS_BY_CINEMA(): string {
    return "http://cinematest.njs.jelastic.vps-host.net/cinema/api/films/cinema/";
  }
  public static get API_FILMS_SHOWING(): string {
   return "http://cinematest.njs.jelastic.vps-host.net/cinema/api/films/nowshowing";
   }
  public static get API_FILMS_COMINGSOON(): string {
    return "http://cinematest.njs.jelastic.vps-host.net/cinema/api/films/comingsoon";
  }

  public static get API_SLIDE_SHOW(): string {
    return "http://cinematest.njs.jelastic.vps-host.net/cinema/api/slideshows/";
  }
}
