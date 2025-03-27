package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CotacaoMoeda extends AbstractSankhyaEntity<CotacaoMoeda> {
   public BigDecimal getCodMoeda() {
        return this.getVo().asBigDecimal("CODMOEDA");
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
   }

   public BigDecimal getCotacao() {
        return this.getVo().asBigDecimal("COTACAO");
   }

   public void setCotacao(BigDecimal cotacao) {
        markAsChanged("COTACAO", cotacao);
   }

   public Timestamp getDtMov() {
        return this.getVo().asTimestamp("DTMOV");
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
   }

   public BigDecimal getIndice2() {
        return this.getVo().asBigDecimal("INDICE2");
   }

   public void setIndice2(BigDecimal indice2) {
        markAsChanged("INDICE2", indice2);
   }

   public BigDecimal getIndiceDesc() {
        return this.getVo().asBigDecimal("INDICEDESC");
   }

   public void setIndiceDesc(BigDecimal indiceDesc) {
        markAsChanged("INDICEDESC", indiceDesc);
   }

   @Override
   public String getTableName() {
        return "TSICOT";
   }

   @Override
   public String getEntityName() {
        return "CotacaoMoeda";
   }

   @Override
   public CotacaoMoeda fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
