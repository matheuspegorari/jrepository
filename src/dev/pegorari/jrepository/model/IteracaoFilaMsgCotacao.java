package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class IteracaoFilaMsgCotacao extends AbstractSankhyaEntity<IteracaoFilaMsgCotacao> {
   private BigDecimal codFila;
   private BigDecimal codParc;
   private BigDecimal contador;
   private BigDecimal numCotacao;

   public BigDecimal getCodFila() {
        return codFila;
   }

   public void setCodFila(BigDecimal codFila) {
        this.codFila = codFila;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getContador() {
        return contador;
   }

   public void setContador(BigDecimal contador) {
        this.contador = contador;
   }

   public BigDecimal getNumCotacao() {
        return numCotacao;
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        this.numCotacao = numCotacao;
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
        this.codFila = vo.asBigDecimal("CODFILA");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.contador = vo.asBigDecimal("CONTADOR");
        this.numCotacao = vo.asBigDecimal("NUMCOTACAO");
        return this;
   }
}
