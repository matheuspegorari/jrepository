package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Impressora extends AbstractSankhyaEntity<Impressora> {
   public String getAliasLocal() {
        return this.getVo().asString("ALIASLOCAL");
   }

   public void setAliasLocal(String aliasLocal) {
        markAsChanged("ALIASLOCAL", aliasLocal);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public Timestamp getDhStatus() {
        return this.getVo().asTimestamp("DHSTATUS");
   }

   public void setDhStatus(Timestamp dhStatus) {
        markAsChanged("DHSTATUS", dhStatus);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getNuPrinter() {
        return this.getVo().asBigDecimal("NUPRINTER");
   }

   public void setNuPrinter(BigDecimal nuPrinter) {
        markAsChanged("NUPRINTER", nuPrinter);
   }

   public BigDecimal getNuSvp() {
        return this.getVo().asBigDecimal("NUSVP");
   }

   public void setNuSvp(BigDecimal nuSvp) {
        markAsChanged("NUSVP", nuSvp);
   }

   public String getPrinterUri() {
        return this.getVo().asString("PRINTERURI");
   }

   public void setPrinterUri(String printerUri) {
        markAsChanged("PRINTERURI", printerUri);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   @Override
   public String getTableName() {
        return "TSIPRN";
   }

   @Override
   public String getEntityName() {
        return "Impressora";
   }

   @Override
   public Impressora fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
