package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConferenciaPedido extends AbstractSankhyaEntity<ConferenciaPedido> {
   private String codBarra;
   private BigDecimal codUsu;
   private BigDecimal nuConf;
   private BigDecimal qtd;
   private BigDecimal sequencia;
   private String tipoConf;
   private Timestamp dhConf;

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
        this.nuConf = nuConf;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
        this.qtd = qtd;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTipoConf() {
        return tipoConf;
   }

   public void setTipoConf(String tipoConf) {
        markAsChanged("TIPOCONF", tipoConf);
        this.tipoConf = tipoConf;
   }

   public Timestamp getDhConf() {
        return dhConf;
   }

   public void setDhConf(Timestamp dhConf) {
        markAsChanged("DHCONF", dhConf);
        this.dhConf = dhConf;
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
        this.codBarra = vo.asString("CODBARRA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuConf = vo.asBigDecimal("NUCONF");
        this.qtd = vo.asBigDecimal("QTD");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipoConf = vo.asString("TIPOCONF");
        this.dhConf = vo.asTimestamp("DHCONF");
        return this;
   }
}
