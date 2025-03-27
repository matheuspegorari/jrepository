package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class IteracaoFilaMsgCotacao extends AbstractSankhyaEntity<IteracaoFilaMsgCotacao> {
   public BigDecimal getCodFila() {
        return this.getVo().asBigDecimal("CODFILA");
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getContador() {
        return this.getVo().asBigDecimal("CONTADOR");
   }

   public void setContador(BigDecimal contador) {
        markAsChanged("CONTADOR", contador);
   }

   public BigDecimal getNumCotacao() {
        return this.getVo().asBigDecimal("NUMCOTACAO");
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        markAsChanged("NUMCOTACAO", numCotacao);
   }

   @Override
   public String getTableName() {
        return "TGFNTC";
   }

   @Override
   public String getEntityName() {
        return "IteracaoFilaMsgCotacao";
   }

   @Override
   public IteracaoFilaMsgCotacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
