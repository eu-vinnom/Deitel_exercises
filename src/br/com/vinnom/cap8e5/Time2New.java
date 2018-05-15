package br.com.vinnom.cap8e5;

public class Time2New
{
  private int second = 0;

  public Time2New()
  {
    this( 0, 0, 0 );
  }

  public Time2New( int h, int m, int s )
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
    this.second += ( ( s >= 0 && s < 60 ) ? s : 0 );
  }

  public void setMinute( int m )
  {
    if( m > 0 && m < 60 )
    {
      this.second += m * 60;
    }
  }

  public void setHour( int h )
  {
    if( h > 0 && h < 24 )
    {
      this.second += h * 3600;
    }
  }

  public int getHour()
  {
    return this.second / 3600;
  }

  public int getMinute()
  {
    return ( this.second / 60 ) % 60;
  }

  public int getSecond()
  {
    return this.second % 60;
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
