package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ServidorImpressao extends AbstractSankhyaEntity<ServidorImpressao> {
   private String ativo;
   private BigDecimal codUsuInc;
   private String descricao;
   private Timestamp dhAlter;
   private BigDecimal nuSvp;
   private BigDecimal porta;
   private String url;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodUsuInc() {
        return codUsuInc;
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        markAsChanged("CODUSUINC", codUsuInc);
        this.codUsuInc = codUsuInc;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuSvp() {
        return nuSvp;
   }

   public void setNuSvp(BigDecimal nuSvp) {
        markAsChanged("NUSVP", nuSvp);
        this.nuSvp = nuSvp;
   }

   public BigDecimal getPorta() {
        return porta;
   }

   public void setPorta(BigDecimal porta) {
        markAsChanged("PORTA", porta);
        this.porta = porta;
   }

   public String getUrl() {
        return url;
   }

   public void setUrl(String url) {
        markAsChanged("URL", url);
        this.url = url;
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
        this.ativo = vo.asString("ATIVO");
        this.codUsuInc = vo.asBigDecimal("CODUSUINC");
        this.descricao = vo.asString("DESCRICAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuSvp = vo.asBigDecimal("NUSVP");
        this.porta = vo.asBigDecimal("PORTA");
        this.url = vo.asString("URL");
        return this;
   }
}
