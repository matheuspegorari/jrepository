package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVariaveisAdicionais implements SankhyaEntity<PrevisaoVariaveisAdicionais> {

   private String chave;
   private BigDecimal codExec;
   private String tipo;

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        this.codExec = codExec;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVariaveisAdicionais";
   }

   @Override
   public PrevisaoVariaveisAdicionais fromVO(DynamicVO vo) {
        this.chave = vo.asString("CHAVE");
        this.codExec = vo.asBigDecimal("CODEXEC");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
