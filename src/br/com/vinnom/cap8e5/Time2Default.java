package br.com.vinnom.cap8e5;

public class Time2Default
{
  private int hour;
  private int minute;
  private int second;

  public Time2Default()
  {
    this( 0, 0, 0 );
  }

  public Time2Default( int h )
  {
    this( h, 0, 0 );
  }

  public Time2Default( int h, int m )
  {
    this( h, m, 0 );
  }

  public Time2Default( int h, int m, int s )
  {
    setTime( h, m, s );
  }

  public void setTime( int h, int m, int s )
  {
    setHour( h );
    setMinute( m );
    setSecond( s );

  }

  public void setSecond( int s )
  {
    this.second = ( ( s >= 0 && s < 60 ) ? s : 0 );
  }

  public void setMinute( int m )
  {
    this.minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
  }

  public void setHour( int h )
  {
    this.hour = ( ( h >= 0 && h < 24 ) ? h : 0 );
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public String toUniversalFormat()
  {
    return String.format( "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
  }

  @Override
  public String toString()
  {
    int hourTest;

    String dayNight;

    hourTest = ( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 );
    dayNight = ( ( getHour() < 12 ) ? "AM" : "PM" );

    return String.format( "%d:%02d:%02d %s", hourTest, getMinute(), getSecond(), dayNight );
  }
}
