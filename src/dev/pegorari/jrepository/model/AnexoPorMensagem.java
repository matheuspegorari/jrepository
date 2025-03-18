package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AnexoPorMensagem extends AbstractSankhyaEntity<AnexoPorMensagem> {
   private BigDecimal codFila;
   private BigDecimal nuAnexo;

   public BigDecimal getCodFila() {
        return codFila;
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
        this.codFila = codFila;
   }

   public BigDecimal getNuAnexo() {
        return nuAnexo;
   }

   public void setNuAnexo(BigDecimal nuAnexo) {
        markAsChanged("NUANEXO", nuAnexo);
        this.nuAnexo = nuAnexo;
   }

   @Override
   public String getTableName() {
        return "TMDAXM";
   }

   @Override
   public String getEntityName() {
        return "AnexoPorMensagem";
   }

   @Override
   public AnexoPorMensagem fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codFila = vo.asBigDecimal("CODFILA");
        this.nuAnexo = vo.asBigDecimal("NUANEXO");
        return this;
   }
}
