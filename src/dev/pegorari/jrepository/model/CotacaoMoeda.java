package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CotacaoMoeda implements SankhyaEntity<CotacaoMoeda> {

   private BigDecimal codMoeda;
   private BigDecimal cotacao;
   private Timestamp dtMov;
   private BigDecimal indice2;
   private BigDecimal indiceDesc;

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCotacao() {
        return cotacao;
   }

   public void setCotacao(BigDecimal cotacao) {
        this.cotacao = cotacao;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        this.dtMov = dtMov;
   }

   public BigDecimal getIndice2() {
        return indice2;
   }

   public void setIndice2(BigDecimal indice2) {
        this.indice2 = indice2;
   }

   public BigDecimal getIndiceDesc() {
        return indiceDesc;
   }

   public void setIndiceDesc(BigDecimal indiceDesc) {
        this.indiceDesc = indiceDesc;
   }

   @Override
   public String getEntityName() {
        return "CotacaoMoeda";
   }

   @Override
   public CotacaoMoeda fromVO(DynamicVO vo) {
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.cotacao = vo.asBigDecimal("COTACAO");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.indice2 = vo.asBigDecimal("INDICE2");
        this.indiceDesc = vo.asBigDecimal("INDICEDESC");
        return this;
   }
}
