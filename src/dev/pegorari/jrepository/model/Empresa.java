package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Empresa extends AbstractSankhyaEntity<Empresa> {
   private BigDecimal ativecon;
   private String cargas;
   private String cep;
   private String cgc;
   private BigDecimal codbai;
   private BigDecimal codcid;
   private String codcnl;
   private BigDecimal codemp;
   private BigDecimal codempmatriz;
   private BigDecimal codend;
   private BigDecimal codmun;
   private BigDecimal codparc;
   private BigDecimal codregtrib;
   private String comissoes;
   private String complemento;
   private Timestamp contabilidade;
   private String cooperativa;
   private String cpfresp;
   private Timestamp dtconvsoc;
   private Timestamp dtregjunta;
   private String dupliv;
   private String email;
   private BigDecimal empagrupargol;
   private String estoque;
   private String fax;
   private String financeiro;
   private String folhapagto;
   private String homepage;
   private String inscestad;
   private String inscmun;
   private String latitude;
   private BigDecimal limcurvaB;
   private BigDecimal limcurvaC;
   private String livrosfiscais;
   private byte[] logomarca;
   private String longitude;
   private String modelonfdes;
   private BigDecimal natestab;
   private BigDecimal natjur;
   private String nomefantasia;
   private String numend;
   private BigDecimal numpropr;
   private String princtitular;
   private String producao;
   private String ramoativ;
   private String razaoabrev;
   private String razaosocial;
   private String regjuntacom;
   private String serienfdes;
   private String simples;
   private String simplesnacnauf;
   private String supdecisao;
   private String telefone;
   private String telex;
   private String tiporegra;
   private BigDecimal tiposn;
   private BigDecimal corempresa;
   private String razaosocialcompleta;
   private BigDecimal qtdacessos;
   private String rntrc;
   private String usarazaosocial;
   private String produtorrural;
   private String empidenotas;
   private Timestamp dhconsitimend;
   private String numtaf;
   private String nurest;
   private BigDecimal acdintisenmulta;
   private BigDecimal classtrib;
   private BigDecimal indconstr;
   private BigDecimal indcoop;
   private BigDecimal indopccp;
   private BigDecimal indsitesp;
   private BigDecimal infoobra;
   private String cotm;
   private BigDecimal cnaeprepon;
   private String cnpjprefeitura;

   public BigDecimal getAtivecon() {
        return ativecon;
   }

   public void setAtivecon(BigDecimal ativecon) {
        markAsChanged("ATIVECON", ativecon);
        this.ativecon = ativecon;
   }

   public String getCargas() {
        return cargas;
   }

   public void setCargas(String cargas) {
        markAsChanged("CARGAS", cargas);
        this.cargas = cargas;
   }

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
        this.cep = cep;
   }

   public String getCgc() {
        return cgc;
   }

   public void setCgc(String cgc) {
        markAsChanged("CGC", cgc);
        this.cgc = cgc;
   }

   public BigDecimal getCodbai() {
        return codbai;
   }

   public void setCodbai(BigDecimal codbai) {
        markAsChanged("CODBAI", codbai);
        this.codbai = codbai;
   }

   public BigDecimal getCodcid() {
        return codcid;
   }

   public void setCodcid(BigDecimal codcid) {
        markAsChanged("CODCID", codcid);
        this.codcid = codcid;
   }

   public String getCodcnl() {
        return codcnl;
   }

   public void setCodcnl(String codcnl) {
        markAsChanged("CODCNL", codcnl);
        this.codcnl = codcnl;
   }

   public BigDecimal getCodemp() {
        return codemp;
   }

   public void setCodemp(BigDecimal codemp) {
        markAsChanged("CODEMP", codemp);
        this.codemp = codemp;
   }

   public BigDecimal getCodempmatriz() {
        return codempmatriz;
   }

   public void setCodempmatriz(BigDecimal codempmatriz) {
        markAsChanged("CODEMPMATRIZ", codempmatriz);
        this.codempmatriz = codempmatriz;
   }

   public BigDecimal getCodend() {
        return codend;
   }

   public void setCodend(BigDecimal codend) {
        markAsChanged("CODEND", codend);
        this.codend = codend;
   }

   public BigDecimal getCodmun() {
        return codmun;
   }

   public void setCodmun(BigDecimal codmun) {
        markAsChanged("CODMUN", codmun);
        this.codmun = codmun;
   }

   public BigDecimal getCodparc() {
        return codparc;
   }

   public void setCodparc(BigDecimal codparc) {
        markAsChanged("CODPARC", codparc);
        this.codparc = codparc;
   }

   public BigDecimal getCodregtrib() {
        return codregtrib;
   }

   public void setCodregtrib(BigDecimal codregtrib) {
        markAsChanged("CODREGTRIB", codregtrib);
        this.codregtrib = codregtrib;
   }

   public String getComissoes() {
        return comissoes;
   }

   public void setComissoes(String comissoes) {
        markAsChanged("COMISSOES", comissoes);
        this.comissoes = comissoes;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
        this.complemento = complemento;
   }

   public Timestamp getContabilidade() {
        return contabilidade;
   }

   public void setContabilidade(Timestamp contabilidade) {
        markAsChanged("CONTABILIDADE", contabilidade);
        this.contabilidade = contabilidade;
   }

   public String getCooperativa() {
        return cooperativa;
   }

   public void setCooperativa(String cooperativa) {
        markAsChanged("COOPERATIVA", cooperativa);
        this.cooperativa = cooperativa;
   }

   public String getCpfresp() {
        return cpfresp;
   }

   public void setCpfresp(String cpfresp) {
        markAsChanged("CPFRESP", cpfresp);
        this.cpfresp = cpfresp;
   }

   public Timestamp getDtconvsoc() {
        return dtconvsoc;
   }

   public void setDtconvsoc(Timestamp dtconvsoc) {
        markAsChanged("DTCONVSOC", dtconvsoc);
        this.dtconvsoc = dtconvsoc;
   }

   public Timestamp getDtregjunta() {
        return dtregjunta;
   }

   public void setDtregjunta(Timestamp dtregjunta) {
        markAsChanged("DTREGJUNTA", dtregjunta);
        this.dtregjunta = dtregjunta;
   }

   public String getDupliv() {
        return dupliv;
   }

   public void setDupliv(String dupliv) {
        markAsChanged("DUPLIV", dupliv);
        this.dupliv = dupliv;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public BigDecimal getEmpagrupargol() {
        return empagrupargol;
   }

   public void setEmpagrupargol(BigDecimal empagrupargol) {
        markAsChanged("EMPAGRUPARGOL", empagrupargol);
        this.empagrupargol = empagrupargol;
   }

   public String getEstoque() {
        return estoque;
   }

   public void setEstoque(String estoque) {
        markAsChanged("ESTOQUE", estoque);
        this.estoque = estoque;
   }

   public String getFax() {
        return fax;
   }

   public void setFax(String fax) {
        markAsChanged("FAX", fax);
        this.fax = fax;
   }

   public String getFinanceiro() {
        return financeiro;
   }

   public void setFinanceiro(String financeiro) {
        markAsChanged("FINANCEIRO", financeiro);
        this.financeiro = financeiro;
   }

   public String getFolhapagto() {
        return folhapagto;
   }

   public void setFolhapagto(String folhapagto) {
        markAsChanged("FOLHAPAGTO", folhapagto);
        this.folhapagto = folhapagto;
   }

   public String getHomepage() {
        return homepage;
   }

   public void setHomepage(String homepage) {
        markAsChanged("HOMEPAGE", homepage);
        this.homepage = homepage;
   }

   public String getInscestad() {
        return inscestad;
   }

   public void setInscestad(String inscestad) {
        markAsChanged("INSCESTAD", inscestad);
        this.inscestad = inscestad;
   }

   public String getInscmun() {
        return inscmun;
   }

   public void setInscmun(String inscmun) {
        markAsChanged("INSCMUN", inscmun);
        this.inscmun = inscmun;
   }

   public String getLatitude() {
        return latitude;
   }

   public void setLatitude(String latitude) {
        markAsChanged("LATITUDE", latitude);
        this.latitude = latitude;
   }

   public BigDecimal getLimcurvaB() {
        return limcurvaB;
   }

   public void setLimcurvaB(BigDecimal limcurvaB) {
        markAsChanged("LIMCURVA_B", limcurvaB);
        this.limcurvaB = limcurvaB;
   }

   public BigDecimal getLimcurvaC() {
        return limcurvaC;
   }

   public void setLimcurvaC(BigDecimal limcurvaC) {
        markAsChanged("LIMCURVA_C", limcurvaC);
        this.limcurvaC = limcurvaC;
   }

   public String getLivrosfiscais() {
        return livrosfiscais;
   }

   public void setLivrosfiscais(String livrosfiscais) {
        markAsChanged("LIVROSFISCAIS", livrosfiscais);
        this.livrosfiscais = livrosfiscais;
   }

   public byte[] getLogomarca() {
        return logomarca;
   }

   public void setLogomarca(byte[] logomarca) {
        markAsChanged("LOGOMARCA", logomarca);
        this.logomarca = logomarca;
   }

   public String getLongitude() {
        return longitude;
   }

   public void setLongitude(String longitude) {
        markAsChanged("LONGITUDE", longitude);
        this.longitude = longitude;
   }

   public String getModelonfdes() {
        return modelonfdes;
   }

   public void setModelonfdes(String modelonfdes) {
        markAsChanged("MODELONFDES", modelonfdes);
        this.modelonfdes = modelonfdes;
   }

   public BigDecimal getNatestab() {
        return natestab;
   }

   public void setNatestab(BigDecimal natestab) {
        markAsChanged("NATESTAB", natestab);
        this.natestab = natestab;
   }

   public BigDecimal getNatjur() {
        return natjur;
   }

   public void setNatjur(BigDecimal natjur) {
        markAsChanged("NATJUR", natjur);
        this.natjur = natjur;
   }

   public String getNomefantasia() {
        return nomefantasia;
   }

   public void setNomefantasia(String nomefantasia) {
        markAsChanged("NOMEFANTASIA", nomefantasia);
        this.nomefantasia = nomefantasia;
   }

   public String getNumend() {
        return numend;
   }

   public void setNumend(String numend) {
        markAsChanged("NUMEND", numend);
        this.numend = numend;
   }

   public BigDecimal getNumpropr() {
        return numpropr;
   }

   public void setNumpropr(BigDecimal numpropr) {
        markAsChanged("NUMPROPR", numpropr);
        this.numpropr = numpropr;
   }

   public String getPrinctitular() {
        return princtitular;
   }

   public void setPrinctitular(String princtitular) {
        markAsChanged("PRINCTITULAR", princtitular);
        this.princtitular = princtitular;
   }

   public String getProducao() {
        return producao;
   }

   public void setProducao(String producao) {
        markAsChanged("PRODUCAO", producao);
        this.producao = producao;
   }

   public String getRamoativ() {
        return ramoativ;
   }

   public void setRamoativ(String ramoativ) {
        markAsChanged("RAMOATIV", ramoativ);
        this.ramoativ = ramoativ;
   }

   public String getRazaoabrev() {
        return razaoabrev;
   }

   public void setRazaoabrev(String razaoabrev) {
        markAsChanged("RAZAOABREV", razaoabrev);
        this.razaoabrev = razaoabrev;
   }

   public String getRazaosocial() {
        return razaosocial;
   }

   public void setRazaosocial(String razaosocial) {
        markAsChanged("RAZAOSOCIAL", razaosocial);
        this.razaosocial = razaosocial;
   }

   public String getRegjuntacom() {
        return regjuntacom;
   }

   public void setRegjuntacom(String regjuntacom) {
        markAsChanged("REGJUNTACOM", regjuntacom);
        this.regjuntacom = regjuntacom;
   }

   public String getSerienfdes() {
        return serienfdes;
   }

   public void setSerienfdes(String serienfdes) {
        markAsChanged("SERIENFDES", serienfdes);
        this.serienfdes = serienfdes;
   }

   public String getSimples() {
        return simples;
   }

   public void setSimples(String simples) {
        markAsChanged("SIMPLES", simples);
        this.simples = simples;
   }

   public String getSimplesnacnauf() {
        return simplesnacnauf;
   }

   public void setSimplesnacnauf(String simplesnacnauf) {
        markAsChanged("SIMPLESNACNAUF", simplesnacnauf);
        this.simplesnacnauf = simplesnacnauf;
   }

   public String getSupdecisao() {
        return supdecisao;
   }

   public void setSupdecisao(String supdecisao) {
        markAsChanged("SUPDECISAO", supdecisao);
        this.supdecisao = supdecisao;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
        this.telefone = telefone;
   }

   public String getTelex() {
        return telex;
   }

   public void setTelex(String telex) {
        markAsChanged("TELEX", telex);
        this.telex = telex;
   }

   public String getTiporegra() {
        return tiporegra;
   }

   public void setTiporegra(String tiporegra) {
        markAsChanged("TIPOREGRA", tiporegra);
        this.tiporegra = tiporegra;
   }

   public BigDecimal getTiposn() {
        return tiposn;
   }

   public void setTiposn(BigDecimal tiposn) {
        markAsChanged("TIPOSN", tiposn);
        this.tiposn = tiposn;
   }

   public BigDecimal getCorempresa() {
        return corempresa;
   }

   public void setCorempresa(BigDecimal corempresa) {
        markAsChanged("COREMPRESA", corempresa);
        this.corempresa = corempresa;
   }

   public String getRazaosocialcompleta() {
        return razaosocialcompleta;
   }

   public void setRazaosocialcompleta(String razaosocialcompleta) {
        markAsChanged("RAZAOSOCIALCOMPLETA", razaosocialcompleta);
        this.razaosocialcompleta = razaosocialcompleta;
   }

   public BigDecimal getQtdacessos() {
        return qtdacessos;
   }

   public void setQtdacessos(BigDecimal qtdacessos) {
        markAsChanged("QTDACESSOS", qtdacessos);
        this.qtdacessos = qtdacessos;
   }

   public String getRntrc() {
        return rntrc;
   }

   public void setRntrc(String rntrc) {
        markAsChanged("RNTRC", rntrc);
        this.rntrc = rntrc;
   }

   public String getUsarazaosocial() {
        return usarazaosocial;
   }

   public void setUsarazaosocial(String usarazaosocial) {
        markAsChanged("USARAZAOSOCIAL", usarazaosocial);
        this.usarazaosocial = usarazaosocial;
   }

   public String getProdutorrural() {
        return produtorrural;
   }

   public void setProdutorrural(String produtorrural) {
        markAsChanged("PRODUTORRURAL", produtorrural);
        this.produtorrural = produtorrural;
   }

   public String getEmpidenotas() {
        return empidenotas;
   }

   public void setEmpidenotas(String empidenotas) {
        markAsChanged("EMPIDENOTAS", empidenotas);
        this.empidenotas = empidenotas;
   }

   public Timestamp getDhconsitimend() {
        return dhconsitimend;
   }

   public void setDhconsitimend(Timestamp dhconsitimend) {
        markAsChanged("DHCONSITIMEND", dhconsitimend);
        this.dhconsitimend = dhconsitimend;
   }

   public String getNumtaf() {
        return numtaf;
   }

   public void setNumtaf(String numtaf) {
        markAsChanged("NUMTAF", numtaf);
        this.numtaf = numtaf;
   }

   public String getNurest() {
        return nurest;
   }

   public void setNurest(String nurest) {
        markAsChanged("NUREST", nurest);
        this.nurest = nurest;
   }

   public BigDecimal getAcdintisenmulta() {
        return acdintisenmulta;
   }

   public void setAcdintisenmulta(BigDecimal acdintisenmulta) {
        markAsChanged("ACDINTISENMULTA", acdintisenmulta);
        this.acdintisenmulta = acdintisenmulta;
   }

   public BigDecimal getClasstrib() {
        return classtrib;
   }

   public void setClasstrib(BigDecimal classtrib) {
        markAsChanged("CLASSTRIB", classtrib);
        this.classtrib = classtrib;
   }

   public BigDecimal getIndconstr() {
        return indconstr;
   }

   public void setIndconstr(BigDecimal indconstr) {
        markAsChanged("INDCONSTR", indconstr);
        this.indconstr = indconstr;
   }

   public BigDecimal getIndcoop() {
        return indcoop;
   }

   public void setIndcoop(BigDecimal indcoop) {
        markAsChanged("INDCOOP", indcoop);
        this.indcoop = indcoop;
   }

   public BigDecimal getIndopccp() {
        return indopccp;
   }

   public void setIndopccp(BigDecimal indopccp) {
        markAsChanged("INDOPCCP", indopccp);
        this.indopccp = indopccp;
   }

   public BigDecimal getIndsitesp() {
        return indsitesp;
   }

   public void setIndsitesp(BigDecimal indsitesp) {
        markAsChanged("INDSITESP", indsitesp);
        this.indsitesp = indsitesp;
   }

   public BigDecimal getInfoobra() {
        return infoobra;
   }

   public void setInfoobra(BigDecimal infoobra) {
        markAsChanged("INFOOBRA", infoobra);
        this.infoobra = infoobra;
   }

   public String getCotm() {
        return cotm;
   }

   public void setCotm(String cotm) {
        markAsChanged("COTM", cotm);
        this.cotm = cotm;
   }

   public BigDecimal getCnaeprepon() {
        return cnaeprepon;
   }

   public void setCnaeprepon(BigDecimal cnaeprepon) {
        markAsChanged("CNAEPREPON", cnaeprepon);
        this.cnaeprepon = cnaeprepon;
   }

   public String getCnpjprefeitura() {
        return cnpjprefeitura;
   }

   public void setCnpjprefeitura(String cnpjprefeitura) {
        markAsChanged("CNPJPREFEITURA", cnpjprefeitura);
        this.cnpjprefeitura = cnpjprefeitura;
   }

   @Override
   public String getTableName() {
        return "TSIEMP";
   }

   @Override
   public String getEntityName() {
        return "Empresa";
   }

   @Override
   public Empresa fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.ativecon = vo.asBigDecimal("ATIVECON");
        this.cargas = vo.asString("CARGAS");
        this.cep = vo.asString("CEP");
        this.cgc = vo.asString("CGC");
        this.codbai = vo.asBigDecimal("CODBAI");
        this.codcid = vo.asBigDecimal("CODCID");
        this.codcnl = vo.asString("CODCNL");
        this.codemp = vo.asBigDecimal("CODEMP");
        this.codempmatriz = vo.asBigDecimal("CODEMPMATRIZ");
        this.codend = vo.asBigDecimal("CODEND");
        this.codmun = vo.asBigDecimal("CODMUN");
        this.codparc = vo.asBigDecimal("CODPARC");
        this.codregtrib = vo.asBigDecimal("CODREGTRIB");
        this.comissoes = vo.asString("COMISSOES");
        this.complemento = vo.asString("COMPLEMENTO");
        this.contabilidade = vo.asTimestamp("CONTABILIDADE");
        this.cooperativa = vo.asString("COOPERATIVA");
        this.cpfresp = vo.asString("CPFRESP");
        this.dtconvsoc = vo.asTimestamp("DTCONVSOC");
        this.dtregjunta = vo.asTimestamp("DTREGJUNTA");
        this.dupliv = vo.asString("DUPLIV");
        this.email = vo.asString("EMAIL");
        this.empagrupargol = vo.asBigDecimal("EMPAGRUPARGOL");
        this.estoque = vo.asString("ESTOQUE");
        this.fax = vo.asString("FAX");
        this.financeiro = vo.asString("FINANCEIRO");
        this.folhapagto = vo.asString("FOLHAPAGTO");
        this.homepage = vo.asString("HOMEPAGE");
        this.inscestad = vo.asString("INSCESTAD");
        this.inscmun = vo.asString("INSCMUN");
        this.latitude = vo.asString("LATITUDE");
        this.limcurvaB = vo.asBigDecimal("LIMCURVA_B");
        this.limcurvaC = vo.asBigDecimal("LIMCURVA_C");
        this.livrosfiscais = vo.asString("LIVROSFISCAIS");
        this.logomarca = vo.asBlob("LOGOMARCA");
        this.longitude = vo.asString("LONGITUDE");
        this.modelonfdes = vo.asString("MODELONFDES");
        this.natestab = vo.asBigDecimal("NATESTAB");
        this.natjur = vo.asBigDecimal("NATJUR");
        this.nomefantasia = vo.asString("NOMEFANTASIA");
        this.numend = vo.asString("NUMEND");
        this.numpropr = vo.asBigDecimal("NUMPROPR");
        this.princtitular = vo.asString("PRINCTITULAR");
        this.producao = vo.asString("PRODUCAO");
        this.ramoativ = vo.asString("RAMOATIV");
        this.razaoabrev = vo.asString("RAZAOABREV");
        this.razaosocial = vo.asString("RAZAOSOCIAL");
        this.regjuntacom = vo.asString("REGJUNTACOM");
        this.serienfdes = vo.asString("SERIENFDES");
        this.simples = vo.asString("SIMPLES");
        this.simplesnacnauf = vo.asString("SIMPLESNACNAUF");
        this.supdecisao = vo.asString("SUPDECISAO");
        this.telefone = vo.asString("TELEFONE");
        this.telex = vo.asString("TELEX");
        this.tiporegra = vo.asString("TIPOREGRA");
        this.tiposn = vo.asBigDecimal("TIPOSN");
        this.corempresa = vo.asBigDecimal("COREMPRESA");
        this.razaosocialcompleta = vo.asString("RAZAOSOCIALCOMPLETA");
        this.qtdacessos = vo.asBigDecimal("QTDACESSOS");
        this.rntrc = vo.asString("RNTRC");
        this.usarazaosocial = vo.asString("USARAZAOSOCIAL");
        this.produtorrural = vo.asString("PRODUTORRURAL");
        this.empidenotas = vo.asString("EMPIDENOTAS");
        this.dhconsitimend = vo.asTimestamp("DHCONSITIMEND");
        this.numtaf = vo.asString("NUMTAF");
        this.nurest = vo.asString("NUREST");
        this.acdintisenmulta = vo.asBigDecimal("ACDINTISENMULTA");
        this.classtrib = vo.asBigDecimal("CLASSTRIB");
        this.indconstr = vo.asBigDecimal("INDCONSTR");
        this.indcoop = vo.asBigDecimal("INDCOOP");
        this.indopccp = vo.asBigDecimal("INDOPCCP");
        this.indsitesp = vo.asBigDecimal("INDSITESP");
        this.infoobra = vo.asBigDecimal("INFOOBRA");
        this.cotm = vo.asString("COTM");
        this.cnaeprepon = vo.asBigDecimal("CNAEPREPON");
        this.cnpjprefeitura = vo.asString("CNPJPREFEITURA");
        return this;
   }
}
