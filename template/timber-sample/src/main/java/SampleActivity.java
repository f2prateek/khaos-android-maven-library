package {{packageName}}.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import butterknife.OnClick;
import butterknife.ButterKnife;

import static android.widget.Toast.LENGTH_SHORT;

public class SampleActivity extends Activity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.sample_activity);
    ButterKnife.inject(this);
  }

  @OnClick({ R.id.hello, R.id.hey, R.id.hi })
  public void greetingClicked(Button button) {
    Toast.makeText(this, "Do something here!", LENGTH_SHORT).show();
  }
}
