package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ServidorImpressao extends AbstractSankhyaEntity<ServidorImpressao> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodUsuInc() {
        return this.getVo().asBigDecimal("CODUSUINC");
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        markAsChanged("CODUSUINC", codUsuInc);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuSvp() {
        return this.getVo().asBigDecimal("NUSVP");
   }

   public void setNuSvp(BigDecimal nuSvp) {
        markAsChanged("NUSVP", nuSvp);
   }

   public BigDecimal getPorta() {
        return this.getVo().asBigDecimal("PORTA");
   }

   public void setPorta(BigDecimal porta) {
        markAsChanged("PORTA", porta);
   }

   public String getUrl() {
        return this.getVo().asString("URL");
   }

   public void setUrl(String url) {
        markAsChanged("URL", url);
   }

   @Override
   public String getTableName() {
        return "TSISVP";
   }

   @Override
   public String getEntityName() {
        return "ServidorImpressao";
   }

   @Override
   public ServidorImpressao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
