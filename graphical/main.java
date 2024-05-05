/*
 * Copyright (C) Gabriel Moura, 2024
 * Todos os direitos reservados.
 */

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Definição de Matérias
    String[] materias = {"Matemática", "Educação Física", "Ciências", "Geografia", "Português", "Inglês", "Artes"};

    // Definição de Professores
    String[] professoresManha = {"Prof. Carlos", "Prof. Ana", "Prof. Pedro", "Prof. Marta", "Prof. Joana", "Prof. Miguel", "Prof. Sofia"};
    String[] professoresTarde = {"Prof. André", "Prof. Renata", "Prof. Lucas", "Prof. Júlia", "Prof. Renato", "Prof. Paula", "Prof. Gabriel"};

    // Definição dos Turnos
    String[][] turnos = {professoresManha, professoresTarde};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner turnoSpinner = findViewById(R.id.turno_spinner);
        Spinner diaSpinner = findViewById(R.id.dia_spinner);
        Button mostrarButton = findViewById(R.id.mostrar_button);
        final TextView resultadoTextView = findViewById(R.id.resultado_text_view);

        ArrayAdapter<CharSequence> turnoAdapter = ArrayAdapter.createFromResource(this,
                R.array.turnos_array, android.R.layout.simple_spinner_item);
        turnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        turnoSpinner.setAdapter(turnoAdapter);

        ArrayAdapter<CharSequence> diaAdapter = ArrayAdapter.createFromResource(this,
                R.array.dias_array, android.R.layout.simple_spinner_item);
        diaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        diaSpinner.setAdapter(diaAdapter);

        mostrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int turnoIndex = turnoSpinner.getSelectedItemPosition();
                int diaIndex = diaSpinner.getSelectedItemPosition();

                if (turnoIndex == AdapterView.INVALID_POSITION || diaIndex == AdapterView.INVALID_POSITION) {
                    return;
                }

                String materia = materias[diaIndex];
                String professor = turnos[turnoIndex][diaIndex];

                resultadoTextView.setText("Matéria: " + materia + "\nProfessor: " + professor);
            }
        });
    }
}
