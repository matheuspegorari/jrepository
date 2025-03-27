package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConferenciaPedido extends AbstractSankhyaEntity<ConferenciaPedido> {
   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuConf() {
        return this.getVo().asBigDecimal("NUCONF");
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
   }

   public BigDecimal getQtd() {
        return this.getVo().asBigDecimal("QTD");
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipoConf() {
        return this.getVo().asString("TIPOCONF");
   }

   public void setTipoConf(String tipoConf) {
        markAsChanged("TIPOCONF", tipoConf);
   }

   public Timestamp getDhConf() {
        return this.getVo().asTimestamp("DHCONF");
   }

   public void setDhConf(Timestamp dhConf) {
        markAsChanged("DHCONF", dhConf);
   }

   @Override
   public String getTableName() {
        return "TGFCON";
   }

   @Override
   public String getEntityName() {
        return "ConferenciaPedido";
   }

   @Override
   public ConferenciaPedido fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
