package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class IdentificadorProduto extends AbstractSankhyaEntity<IdentificadorProduto> {
   public String getIdentificador() {
        return this.getVo().asString("IDENTIFICADOR");
   }

   public void setIdentificador(String identificador) {
        markAsChanged("IDENTIFICADOR", identificador);
   }

   public BigDecimal getNuConf() {
        return this.getVo().asBigDecimal("NUCONF");
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getSeqId() {
        return this.getVo().asBigDecimal("SEQID");
   }

   public void setSeqId(BigDecimal seqId) {
        markAsChanged("SEQID", seqId);
   }

   public BigDecimal getAgrupamento() {
        return this.getVo().asBigDecimal("AGRUPAMENTO");
   }

   public void setAgrupamento(BigDecimal agrupamento) {
        markAsChanged("AGRUPAMENTO", agrupamento);
   }

   public BigDecimal getSeqConf() {
        return this.getVo().asBigDecimal("SEQCONF");
   }

   public void setSeqConf(BigDecimal seqConf) {
        markAsChanged("SEQCONF", seqConf);
   }

   @Override
   public String getTableName() {
        return "TGFIDPC";
   }

   @Override
   public String getEntityName() {
        return "IdentificadorProduto";
   }

   @Override
   public IdentificadorProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
