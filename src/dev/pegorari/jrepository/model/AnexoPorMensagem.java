package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AnexoPorMensagem extends AbstractSankhyaEntity<AnexoPorMensagem> {
   public BigDecimal getCodFila() {
        return this.getVo().asBigDecimal("CODFILA");
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
   }

   public BigDecimal getNuAnexo() {
        return this.getVo().asBigDecimal("NUANEXO");
   }

   public void setNuAnexo(BigDecimal nuAnexo) {
        markAsChanged("NUANEXO", nuAnexo);
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
        this.setVo(vo);
        return this;
   }
}
